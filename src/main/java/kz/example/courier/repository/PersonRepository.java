package kz.example.courier.repository;

import kz.example.courier.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {

    // Для логина: проверяем, есть ли такой телефон
    Optional<Person> findByPhone(String phone);

    // Для валидации при регистрации: чтобы не создать дубликат
    boolean existsByPhone(String phone);
}
