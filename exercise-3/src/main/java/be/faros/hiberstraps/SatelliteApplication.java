package be.faros.hiberstraps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication(exclude= FlywayAutoConfiguration.class)
public class SatelliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatelliteApplication.class, args);
	}

}
