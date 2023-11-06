package be.faros.hiberstraps.domain;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.UUID;

@MappedSuperclass
@AttributeOverride(name = "id", column = @Column(columnDefinition = "UUID"))
public class BaseEntity extends AbstractPersistable<UUID> {
}
