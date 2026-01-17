package com.example.Accounts.controller;

import com.example.Accounts.dto.account.AccountRequestDto;
import com.example.Accounts.dto.account.AccountResponseDto;
import com.example.Accounts.dto.account.AccountsDto;
import com.example.Accounts.dto.golbal.ResponseDto;
import com.example.Accounts.services.imp.AccountServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController @AllArgsConstructor
@RequestMapping("/account")
@Validated
public class AccountsController {

    AccountServices accountServices;

    @PostMapping
    public ResponseEntity createAccount(@Valid @RequestBody AccountsDto accountsDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(accountServices.createAccount(accountsDto));

    }

    @GetMapping
    public ResponseEntity<AccountResponseDto> getAccount(@Valid@RequestBody AccountRequestDto accountRequestDto){

        return ResponseEntity.ok(accountServices.getAccount(accountRequestDto));

    }

    @DeleteMapping
    public ResponseEntity<ResponseDto> deleteAccount(@Valid@RequestBody AccountRequestDto accountRequestDto){

        return ResponseEntity.status(HttpStatus.FOUND).body(accountServices.deleteAccount(accountRequestDto));

    }


}
