package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.Galaxy;
import be.faros.hiberstraps.domain.Planetoid;
import be.faros.hiberstraps.domain.SpaceObject;
import be.faros.hiberstraps.domain.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface SpaceObjectRepository extends JpaRepository<SpaceObject, UUID> {
    @Query("SELECT s FROM SpaceObject s")
    List<SpaceObject> findAllOrbitingStar();


    @Query("SELECT s FROM SpaceObject s JOIN s.centralBody star " +
            "WHERE TYPE(s) IN (Planet, Planetoid) " +
            "AND TYPE(star) = Star AND star.type = :starType " +
            "AND star.name ILIKE '%' || :starName || '%'")
    List<SpaceObject> findAllByNameAndStarType(String starName, Star.Type starType);

}
