package com.example.Accounts.dto.user;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResposneDto {

    private int id;

    private String name;


    private String email;


    private String phone;
}
