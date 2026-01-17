package com.example.Accounts.dto.account;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountRequestDto {
    @NotBlank
    @Pattern(regexp = "^$|[0-9]{11}")
    private String phone;
}
