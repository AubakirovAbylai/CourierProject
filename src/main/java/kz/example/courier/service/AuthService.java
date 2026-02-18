package kz.example.courier.service;

import kz.example.courier.dto.RegisterCourierDto;
import kz.example.courier.dto.RegisterOrgDto;
import kz.example.courier.entity.Courier;
import kz.example.courier.entity.Organization;
import kz.example.courier.entity.Person;
import kz.example.courier.repository.CourierRepository;
import kz.example.courier.repository.OrganizationRepository;
import kz.example.courier.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final PersonRepository personRepository;
    private final CourierRepository courierRepository;
    private final OrganizationRepository organizationRepository;

    @Transactional
    public void registerCourier(RegisterCourierDto dto) {
        // 1. Создаем Person
        Person person = createBasePerson(dto.getPhone(), dto.getPassword(), dto.getName(), dto.getLastName(), "ROLE_COURIER");

        // 2. Создаем Courier
        Courier courier = new Courier();
        courier.setPerson(person);
        courier.setVehicleType(dto.getVehicleType());
        courier.setLicensePlate(dto.getLicensePlate());

        courierRepository.save(courier);
    }

    @Transactional
    public void registerOrganization(RegisterOrgDto dto) {
        // 1. Создаем Person
        Person person = createBasePerson(dto.getPhone(), dto.getPassword(), dto.getName(), dto.getLastName(), "ROLE_ORG");

        // 2. Создаем Organization
        Organization org = new Organization();
        org.setPerson(person);
        org.setOrgName(dto.getOrgName());
        org.setBin(dto.getBin());
        org.setAddress(dto.getAddress());
        org.setCity(dto.getCity());

        organizationRepository.save(org);
    }

    private Person createBasePerson(String phone, String password, String name, String lastName, String role) {
        Person person = new Person();
        person.setPhone(phone);
        person.setPassword(password); // Сохраняем чистый текст для тестов
        person.setName(name);
        person.setLastName(lastName);
        person.setRole(role);
        return personRepository.save(person);
    }
}