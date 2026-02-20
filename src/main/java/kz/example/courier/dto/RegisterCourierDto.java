package kz.example.courier.dto;

import lombok.Data; // Проверьте этот импорт
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data // Генерирует геттеры, сеттеры, toString, equals и hashCode
@NoArgsConstructor
@AllArgsConstructor
public class RegisterCourierDto {
    private String phone;
    private String password;
    private String name;
    private String lastName;
    private String vehicleType;
    private String licensePlate;
}