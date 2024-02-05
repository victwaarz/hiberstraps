package be.faros.hiberstraps.repositories;

import be.faros.hiberstraps.domain.Galaxy;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface GalaxyRepository extends Repository<Galaxy, UUID>, JpaSpecificationExecutor<Galaxy> {
    default Galaxy findGalaxyByNameExactly(String name){
        return findOne(
                (galaxy, query, cb) ->
                        cb.equal(galaxy.get("name"), name))
                .orElse(null);
    }

    default Galaxy findGalaxyByNameFuzzy(String name){
        return findOne(
                    (galaxy, query, cb) ->
                            cb.like(cb.upper(galaxy.get("name")), "%"+name.toUpperCase()+"%")
        ).orElse(null);
    }


}
