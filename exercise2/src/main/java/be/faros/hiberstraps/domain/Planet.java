package be.faros.hiberstraps.domain;

import javax.persistence.Entity;

@Entity
public class Planet extends Satellite{
    private boolean gaseous;

    public boolean isGaseous() {
        return gaseous;
    }

    public void setGaseous(boolean gaseous) {
        this.gaseous = gaseous;
    }
}
