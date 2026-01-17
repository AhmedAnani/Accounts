package com.example.Accounts.dto.account;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class AccountResponseDto {

    private String userName;

    private int accountNumber;


    private String accountType;


    private String branchAddress;
}
