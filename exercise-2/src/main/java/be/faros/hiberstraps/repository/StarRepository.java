package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import be.faros.hiberstraps.domain.Star;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StarRepository extends JpaRepository<Star, UUID> {
    List<Star> findAllByGalaxy(Galaxy galaxy);
}
