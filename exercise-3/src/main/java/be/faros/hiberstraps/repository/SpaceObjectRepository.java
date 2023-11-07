package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Planet;
import be.faros.hiberstraps.domain.Planetoid;
import be.faros.hiberstraps.domain.SpaceObject;
import be.faros.hiberstraps.domain.Star;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface SpaceObjectRepository extends Repository<SpaceObject, UUID>, JpaSpecificationExecutor<SpaceObject> {
    default List<SpaceObject> findAllOrbitingStar() {
        return findAll((root, query, cb) -> {
            Join<Object, Object> cb1 = root.join("centralBody");
            Join<Object, Object> cb2 = cb1.join("centralBody", JoinType.LEFT);
            Join<Object, Object> cb3 = cb2.join("centralBody", JoinType.LEFT);

            Predicate p1 = cb.and(cb.isNotNull(cb1), cb.equal(cb1.type(), Star.class));
            Predicate p2 = cb.and(cb.isNotNull(cb2), cb.equal(cb2.type(), Star.class));
            Predicate p3 = cb.and(cb.isNotNull(cb3), cb.equal(cb3.type(), Star.class));

            return cb.or(p1, p2, p3);
        });
    }

    default List<SpaceObject> findPlanetsAndPlanetoidsByNameOrbitingStarOfType(String name, Star.Type starType) {
        return findAll((root, query, cb) -> {
            Predicate namePredicate = cb.like(cb.upper(root.get("name")), "%" + name.toUpperCase() + "%");

            Join<Object, Object> centralBody = root.join("centralBody");
            Predicate cbPredicate = cb.and(cb.equal(centralBody.type(), Star.class), cb.equal(centralBody.get("type"), starType));
            Predicate typePredicate = root.type().in(Planet.class, Planetoid.class);
            return cb.and(cbPredicate, typePredicate, namePredicate);
        });
    }
}
