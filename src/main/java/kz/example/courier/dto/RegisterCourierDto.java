package kz.example.courier.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegisterCourierDto {
    private String phone;
    private String password;
    private String name;
    private String lastName;
    private String vehicleType;
    private String licensePlate;
}
