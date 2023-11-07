package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

public interface GalaxyRepository extends Repository<Galaxy, UUID>, JpaSpecificationExecutor<Galaxy> {
    default Optional<Galaxy> findByName(String name) {
        return findOne((root, query, cb) -> {
            return cb.equal(root.get("name"), name);
        });
    }

    default Optional<Galaxy> findByNameFuzzy(String name) {
        return findOne((root, query, cb) -> {
            return cb.like(root.get("name"), "%" + name + "%");
        });
    }
}
