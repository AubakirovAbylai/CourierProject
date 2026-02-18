package kz.example.courier.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegisterOrgDto {
    private String phone;
    private String password;
    private String name;
    private String lastName;
    private String orgName;
    private String bin;
    private String address;
    private String city;
}
