package be.faros.hiberstraps.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "planetoid")
@DiscriminatorValue("planetoid")
public class Planetoid extends SpaceObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shape")
    @Enumerated
    private Shape shape;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
