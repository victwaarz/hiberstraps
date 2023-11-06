package be.faros.hiberstraps.demo.repository;

import be.faros.hiberstraps.demo.domain.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository {
    private final EntityManager em;

    public CourseRepository(EntityManager em) {
        this.em = em;
    }

    public List<Course> findCoursesByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Course> query = cb.createQuery(Course.class);

        Root<Course> root = query.from(Course.class);

        Path<Object> name = root.get("name");

        Predicate test = cb.equal(name, "test");
        cb.not(test);

        query.where(test);

        TypedQuery<Course> query1 = em.createQuery(query);

        return query1.getResultList();
    }
}
