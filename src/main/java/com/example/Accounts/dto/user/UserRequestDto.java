package com.example.Accounts.dto.user;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class UserRequestDto {
    @Email
    private String email;
}
