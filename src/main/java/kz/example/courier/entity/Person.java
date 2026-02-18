package kz.example.courier.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.UUID;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "phone", unique = true, nullable = false)
    private String phone;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "role", nullable = false)
    private String role;
}