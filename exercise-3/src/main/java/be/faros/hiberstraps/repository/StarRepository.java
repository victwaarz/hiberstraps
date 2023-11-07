package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import be.faros.hiberstraps.domain.Star;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface StarRepository extends Repository<Star, UUID>, JpaSpecificationExecutor<Star> {
    default List<Star> findAllByGalaxy(Galaxy galaxy) {
        return findAll((root, query, cb) -> {
            return cb.equal(root.get("galaxy"), galaxy);
        });
    }
}
