package be.faros.hiberstraps.repository;

import be.faros.hiberstraps.domain.SpaceObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SpaceObjectRepositoryTest {
    @Autowired
    private SpaceObjectRepository repo;

    @Test
    public void test_findAllOrbitingStar() {
        SpaceObject a = repo.getById(UUID.fromString("1a317980-62b7-4ac8-a6b2-78ebe8b077f0"));
        SpaceObject b = repo.getById(UUID.fromString("caf47def-e31b-44c8-8e62-662be7d65e2d"));
        SpaceObject c = repo.getById(UUID.fromString("813ae614-ed2d-4156-b6d7-a6e5e9b1c296"));
        SpaceObject d = repo.getById(UUID.fromString("80d4df3e-2240-424d-8b76-b410b252389c"));
        SpaceObject e = repo.getById(UUID.fromString("bf4c72e1-c416-4938-8291-b10d0f4ceac4"));
        SpaceObject f = repo.getById(UUID.fromString("273974a5-caf8-46a6-b5c4-440f6fbece3c"));
        SpaceObject g = repo.getById(UUID.fromString("0970f78e-c852-4751-ba3f-8fb8a3bb6d98"));
        SpaceObject h = repo.getById(UUID.fromString("ccacf5a2-303f-4ab2-bdec-f119d3f1fe60"));
        SpaceObject i = repo.getById(UUID.fromString("60887d5d-6c01-450d-8c84-ec628e096a40"));
        SpaceObject j = repo.getById(UUID.fromString("5583daa0-5961-4d5f-94d9-f71a39eaf5b6"));
        SpaceObject k = repo.getById(UUID.fromString("f6cb2906-9d84-4ba5-9491-e7be5082987e"));
        SpaceObject l = repo.getById(UUID.fromString("0076f576-6ac0-48b0-b898-dbb25504e2ef"));
        SpaceObject m = repo.getById(UUID.fromString("1a9375bc-7606-4888-8a27-cf57838114ba"));
        SpaceObject n = repo.getById(UUID.fromString("f0ee90a3-b242-4d2e-8a5a-bb2fd118cc9b"));
        SpaceObject o = repo.getById(UUID.fromString("be4ca182-8869-4b7b-9b2d-63e6608adac5"));
        SpaceObject p = repo.getById(UUID.fromString("9cd4f1f3-453f-4f84-827d-27acc6c186a3"));
        SpaceObject q = repo.getById(UUID.fromString("cf0a283c-1caa-45be-9fb5-2be65b6a44bd"));
        SpaceObject r = repo.getById(UUID.fromString("7b9ee190-3e04-4952-9837-7caf327a454a"));
        SpaceObject s = repo.getById(UUID.fromString("a69a202c-2691-4114-b8f7-9aef99cea844"));
        SpaceObject t = repo.getById(UUID.fromString("51ed66d8-0f6e-40bb-b073-9e263e1b62ed"));
        SpaceObject u = repo.getById(UUID.fromString("e84d4acf-6cf4-42d5-810d-48b02e986295"));
        SpaceObject v = repo.getById(UUID.fromString("7c91631e-6897-4573-a10c-5e7b4ab2b08b"));
        List<SpaceObject> result = repo.findAllOrbitingStar();
        assertThat(result).containsOnly(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v);
    }
}
