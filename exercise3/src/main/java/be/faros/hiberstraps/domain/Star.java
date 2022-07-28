package be.faros.hiberstraps.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class Star extends Satellite {
    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne(optional = false)
    private Galaxy galaxy;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Galaxy getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public enum Type {
        RED_GIANT, YELLOW_GIANT, BLUE_GIANT, WHITE_DWARF, RED_DWARF, BROWN_DWARF
    }
}
