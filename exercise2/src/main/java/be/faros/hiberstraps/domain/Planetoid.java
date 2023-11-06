package be.faros.hiberstraps.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Planetoid extends SpaceObject {
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
