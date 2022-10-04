package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import be.faros.hiberstraps.domain.Star;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StarRepository {
    private final EntityManager em;

    public StarRepository(EntityManager em) {
        this.em = em;
    }

    public List<Star> findAllByGalaxy(Galaxy galaxy) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Star> query = cb.createQuery(Star.class);

        Root<Star> root = query.from(Star.class);

        query.where(cb.equal(root.get("galaxy"), galaxy));

        query.select(root);

        TypedQuery<Star> tq = em.createQuery(query);
        return tq.getResultList();
    }
}
