package be.faros.hiberstraps.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Planetoid extends Satellite {
    @Enumerated(EnumType.STRING)
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public enum Shape {
        IRREGULAR, SPHERICAL
    }
}
