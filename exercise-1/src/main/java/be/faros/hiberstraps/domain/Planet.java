package be.faros.hiberstraps.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "planet")
@DiscriminatorValue("planet")
public class Planet extends SpaceObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gaseous")
    private boolean gaseous;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isGaseous() {
        return gaseous;
    }

    public void setGaseous(boolean gaseous) {
        this.gaseous = gaseous;
    }
}
