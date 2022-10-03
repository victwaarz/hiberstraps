package be.faros.hiberstraps.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Galaxy extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "galaxy")
    private List<Star> stars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }
}
