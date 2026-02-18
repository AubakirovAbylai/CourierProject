package kz.example.courier.repository;

import kz.example.courier.entity.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourierRepository extends JpaRepository<Courier, UUID> {
    // Здесь мы можем искать курьера сразу по его ID (который совпадает с Person ID)
}