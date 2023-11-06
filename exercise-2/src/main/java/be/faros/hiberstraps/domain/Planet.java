package be.faros.hiberstraps.domain;

import jakarta.persistence.Entity;

@Entity
public class Planet extends SpaceObject {
    private boolean gaseous;

    public boolean isGaseous() {
        return gaseous;
    }

    public void setGaseous(boolean gaseous) {
        this.gaseous = gaseous;
    }
}
