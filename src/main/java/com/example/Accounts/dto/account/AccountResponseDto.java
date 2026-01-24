package com.example.Accounts.dto.account;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDto {

    private String userName;

    private int accountNumber;


    private String accountType;


    private String branchAddress;
}
