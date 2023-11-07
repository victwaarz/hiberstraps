package be.faros.hiberstraps.demo;

import be.faros.hiberstraps.demo.repository.CourseJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private CourseJpaRepository courseJpaRepository;
	@Test
	void contextLoads() {
		courseJpaRepository.findAll();
	}

}
