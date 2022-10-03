package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class GalaxyRepository {
    private final EntityManager em;

    public GalaxyRepository(EntityManager em) {
        this.em = em;
    }

    public Galaxy findByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Galaxy> query = cb.createQuery(Galaxy.class);

        Root<Galaxy> root = query.from(Galaxy.class);

        query.where(cb.equal(root.get("name"), name));

        TypedQuery<Galaxy> tq = em.createQuery(query);

        return tq.getSingleResult();
    }

    public Galaxy findByFuzzyName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Galaxy> query = cb.createQuery(Galaxy.class);

        Root<Galaxy> root = query.from(Galaxy.class);

        query.where(cb.like(root.get("name"), "%" + name + "%"));

        TypedQuery<Galaxy> tq = em.createQuery(query);

        return tq.getSingleResult();
    }
}
