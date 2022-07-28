package be.faros.hiberstraps.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Satellite extends BaseEntity {
    private String name;
    private long orbitalPeriod;
    private double eccentricity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(long orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }
}
