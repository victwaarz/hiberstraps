package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class GalaxyRepository {
    private final EntityManager entityManager;

    public GalaxyRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
