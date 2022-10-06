package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Planet;
import be.faros.hiberstraps.domain.Planetoid;
import be.faros.hiberstraps.domain.SpaceObject;
import be.faros.hiberstraps.domain.Star;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;
import java.util.UUID;

@Repository
public class SpaceObjectRepository {
    private final EntityManager em;

    public SpaceObjectRepository(EntityManager em) {
        this.em = em;
    }


    public SpaceObject getById(UUID id) {
        return em.find(SpaceObject.class, id);
    }

    public List<SpaceObject> findAllOrbitingStar() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SpaceObject> query = cb.createQuery(SpaceObject.class);

        Root<SpaceObject> root = query.from(SpaceObject.class);
        Join<SpaceObject, SpaceObject> firstLayer = root.join("centralBody", JoinType.LEFT);
        Join<SpaceObject, SpaceObject> secondLayer = firstLayer.join("centralBody", JoinType.LEFT);
        Join<SpaceObject, SpaceObject> thirdLayer = secondLayer.join("centralBody", JoinType.LEFT);

        query.where(cb.or(cb.equal(firstLayer.type(), Star.class), cb.equal(secondLayer.type(), Star.class), cb.equal(thirdLayer.type(), Star.class)));

        query.select(root);

        TypedQuery<SpaceObject> tq = em.createQuery(query);
        return tq.getResultList();
    }

    public List<SpaceObject> findPlanetsAndPlanetoidsByFuzzyNameAndOrbitingStar(String name, Star.Type type) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SpaceObject> query = cb.createQuery(SpaceObject.class);

        Root<SpaceObject> root = query.from(SpaceObject.class);
        Join<SpaceObject, SpaceObject> join = root.join("centralBody");

        query.where(cb.and(
                cb.in(root.type()).in(Planet.class, Planetoid.class),
                cb.equal(join.type(), Star.class),
                cb.equal(join.get("type"), type),
                cb.like(root.get("name"), "%" + name + "%")));

        query.select(root);

        TypedQuery<SpaceObject> tq = em.createQuery(query);
        return tq.getResultList();
    }
}
