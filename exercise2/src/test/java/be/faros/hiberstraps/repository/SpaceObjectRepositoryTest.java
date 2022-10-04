package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.SpaceObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class SpaceObjectRepositoryTest {
    @Autowired
    private SpaceObjectRepository repo;

    @Test
    public void test_findAllOrbitingStar() {
        SpaceObject fomB = repo.getById(UUID.fromString("7c91631e-6897-4573-a10c-5e7b4ab2b08b"));

        List<SpaceObject> result = repo.findAllOrbitingStar();
        assertThat(result).containsExactlyInAnyOrder(fomB);
    }
}
