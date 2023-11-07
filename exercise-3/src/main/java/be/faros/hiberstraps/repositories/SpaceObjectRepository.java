package be.faros.hiberstraps.repositories;

import be.faros.hiberstraps.domain.Planet;
import be.faros.hiberstraps.domain.Planetoid;
import be.faros.hiberstraps.domain.SpaceObject;
import be.faros.hiberstraps.domain.Star;
import be.faros.hiberstraps.domain.Star.Type;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface SpaceObjectRepository extends Repository<SpaceObject, UUID>, JpaSpecificationExecutor<SpaceObject> {
    default List<SpaceObject> findAllOrbitingStar(){
        return findAll(
                (spaceObject, query, cb) -> {

                    Join<SpaceObject, SpaceObject> spaceObjectCentralBodyLayerOne = spaceObject.join("centralBody", JoinType.LEFT);
                    Join<SpaceObject, SpaceObject> spaceObjectCentralBodyLayerTwo = spaceObjectCentralBodyLayerOne.join("centralBody", JoinType.LEFT);

                    return cb.or(
                            cb.equal(spaceObjectCentralBodyLayerOne.type(), Star.class),
                            cb.equal(spaceObjectCentralBodyLayerTwo.type(), Star.class)
                    );
                }
        );
    }

    default List<SpaceObject> findAllByNameAndStarType(String name, Type starType){
        return findAll(
                (spaceObject, query, cb) -> {
                    Join<SpaceObject, SpaceObject> centralBody = spaceObject.join("centralBody", JoinType.INNER);
                    System.out.println(centralBody);
                    return cb.and(
                            cb.or(
                                    cb.equal(spaceObject.type(), Planet.class),
                                    cb.equal(spaceObject.type(), Planetoid.class)
                            ),
                            cb.and(
                                    cb.like(cb.upper(spaceObject.get("name")), '%' + name.toUpperCase() + '%'),
                                    cb.isNotNull(spaceObject.get("centralBody")),
                                    cb.equal(centralBody.type(), Star.class),
                                    cb.equal(centralBody.get("type"), starType)
                            )
                    ); }
        );
    }
}
