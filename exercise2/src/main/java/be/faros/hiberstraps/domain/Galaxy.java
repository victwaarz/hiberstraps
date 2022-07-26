package be.faros.hiberstraps.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Galaxy extends BaseEntity{
    private String name;

    @OneToMany(mappedBy = "galaxy")
    private List<Satellite> objects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
