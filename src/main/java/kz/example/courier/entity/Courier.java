package kz.example.courier.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "couriers")
@Getter
@Setter
public class Courier {
    @Id
    @Column(name = "id")
    private UUID id; // Будет таким же, как у Person

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId // Говорит Hibernate: используй ID от Person как первичный ключ здесь
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "license_plate")
    private String licensePlate;
}
