package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.SpaceObject;
import be.faros.hiberstraps.domain.Star;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SpaceObjectRepositoryTest {
    @Autowired
    private SpaceObjectRepository repository;

    @Test
    public void findAllByNameAndStarType() {
        List<SpaceObject> result = repository.findAllByNameAndStarType("rra", Star.Type.YELLOW_DWARF);
        System.out.println(result);

        assertThat(result).isNotNull().isNotEmpty().size().isEqualTo(1);
        SpaceObject spaceObject = result.get(0);
        assertThat(spaceObject.getName()).isEqualTo("Terra");
    }

    @Test
    public void findAllOrbitingStar() {
        List<SpaceObject> result = repository.findAllOrbitingStar();

        assertThat(result).isNotNull().isNotEmpty().size().isEqualTo(22);
    }
}