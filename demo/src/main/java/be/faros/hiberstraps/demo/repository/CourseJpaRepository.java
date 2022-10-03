package be.faros.hiberstraps.demo.repository;

import be.faros.hiberstraps.demo.domain.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CourseJpaRepository extends CrudRepository<Course, UUID> {
    List<Course> findAllByName(String name);
}
