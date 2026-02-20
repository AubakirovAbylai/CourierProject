package kz.example.courier.controller;

import kz.example.courier.dto.RegisterCourierDto;
import kz.example.courier.dto.RegisterOrgDto;
import kz.example.courier.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor // Это создаст конструктор для final полей
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register/courier")
    public ResponseEntity<?> registerCourier(@RequestBody RegisterCourierDto dto) {
        authService.registerCourier(dto);
        return ResponseEntity.ok("Courier registered");
    }

    @PostMapping("/register/org")
    public ResponseEntity<?> registerOrg(@RequestBody RegisterOrgDto dto) {
        authService.registerOrganization(dto);
        return ResponseEntity.ok("Organization registered");
    }
}