package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Planet;
import be.faros.hiberstraps.domain.Planetoid;
import be.faros.hiberstraps.domain.SpaceObject;
import be.faros.hiberstraps.domain.Star;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

public class SpaceObjectRepository {
    private final EntityManager em;

    public SpaceObjectRepository(EntityManager em) {
        this.em = em;
    }

    public List<SpaceObject> findAllOrbitingStar() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SpaceObject> query = cb.createQuery(SpaceObject.class);

        Root<SpaceObject> root = query.from(SpaceObject.class);
        Join<SpaceObject, SpaceObject> firstLayer = root.join("centralBody");
        Join<SpaceObject, SpaceObject> secondLayer = root.join("centralBody");
        Join<SpaceObject, SpaceObject> thirdLayer = root.join("centralBody");

        query.where(cb.or(cb.equal(firstLayer.type(), Star.class), cb.equal(secondLayer.type(), Star.class), cb.equal(thirdLayer.type(), Star.class)));

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

        TypedQuery<SpaceObject> tq = em.createQuery(query);

        return tq.getResultList();
    }
}
