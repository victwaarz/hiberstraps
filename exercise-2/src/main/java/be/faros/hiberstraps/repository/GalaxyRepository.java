package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface GalaxyRepository extends JpaRepository<Galaxy, UUID> {
    @Query("SELECT g FROM Galaxy g WHERE g.name = ?1")
    List<Galaxy> findGalaxyByName(String name);

    @Query(value = "SELECT g FROM Galaxy g WHERE UPPER(g.name) LIKE '%' + UPPER(?1) + '%'")
    List<Galaxy> findGalaxiesByNameFuzzy(String name);
}
