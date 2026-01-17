package com.example.Accounts.dto.account;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data @AllArgsConstructor
public class AccountsDto {
    @NonNull
    private int userId;
    @NotBlank
    private String accountType;
    @NotBlank
    private String branchAddress;
}
