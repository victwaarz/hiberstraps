package be.faros.hiberstraps.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "spaceObject")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class SpaceObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "orbitalPeriod")
    private int orbitalPeriod;

    @Column(name = "eccentricity")
    private double eccentricity;

    @OneToMany
    private List<SpaceObject> sattelites;

    @ManyToOne
    private SpaceObject centralBody;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public List<SpaceObject> getSattelites() {
        return sattelites;
    }

    public void setSattelites(List<SpaceObject> sattelites) {
        this.sattelites = sattelites;
    }

    public SpaceObject getCentralBody() {
        return centralBody;
    }

    public void setCentralBody(SpaceObject centralBody) {
        this.centralBody = centralBody;
    }
}
