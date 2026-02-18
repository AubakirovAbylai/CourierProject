package kz.example.courier.repository;

import kz.example.courier.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, UUID> {

    // Поиск по БИНу (например, для проверки перед регистрацией)
    Optional<Organization> findByBin(String bin);
}