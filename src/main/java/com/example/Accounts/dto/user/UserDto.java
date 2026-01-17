package com.example.Accounts.dto.user;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data @AllArgsConstructor
public class UserDto {

    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    @Length(min = 11,max = 11)
    private String phone;

}
