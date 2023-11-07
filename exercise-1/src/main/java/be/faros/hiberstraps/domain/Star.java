package be.faros.hiberstraps.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "star")
@DiscriminatorValue("star")
public class Star extends SpaceObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    @Enumerated
    private Type type;

    @ManyToOne
    private Galaxy galaxy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
