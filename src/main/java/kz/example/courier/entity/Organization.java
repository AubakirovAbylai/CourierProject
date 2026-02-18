package kz.example.courier.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "organizations")
@Getter
@Setter
public class Organization {
    @Id
    @Column(name = "id") // Первичный ключ этой таблицы
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "org_name", nullable = false)
    private String orgName;

    @Column(name = "bin", unique = true, nullable = false)
    private String bin;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;
}
