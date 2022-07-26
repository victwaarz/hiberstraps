package be.faros.hiberstraps.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Star extends Satellite {
    @Enumerated(EnumType.STRING)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        RED_GIANT, YELLOW_GIANT, BLUE_GIANT, WHITE_DWARF, RED_DWARF, BROWN_DWARF
    }
}
