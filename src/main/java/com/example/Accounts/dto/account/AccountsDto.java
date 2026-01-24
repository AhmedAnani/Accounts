package com.example.Accounts.dto.account;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDto {
    @NonNull
    private int userId;
    @NotBlank
    private String accountType;
    @NotBlank
    private String branchAddress;
}
