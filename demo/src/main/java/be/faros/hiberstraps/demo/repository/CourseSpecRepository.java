package be.faros.hiberstraps.demo.repository;

import be.faros.hiberstraps.demo.domain.Course;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseSpecRepository extends JpaSpecificationExecutor<Course> {

//    public default List<Course> findCoursesByName(String name) {
//    }
}
