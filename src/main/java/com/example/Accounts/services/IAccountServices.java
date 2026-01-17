package com.example.Accounts.services;


import com.example.Accounts.dto.account.AccountRequestDto;
import com.example.Accounts.dto.account.AccountResponseDto;
import com.example.Accounts.dto.account.AccountsDto;
import com.example.Accounts.dto.golbal.ResponseDto;

public interface IAccountServices {
    /**
     * Create account
     * @Param AccountDto
     * @Return ResponseDto
     */
     ResponseDto createAccount(AccountsDto accountsDto);

    /**
     *  GET account
     * @Param AccountRequestDto
     * @Return AccountResponseDto
     */
     AccountResponseDto getAccount(AccountRequestDto accountRequestDto);

    /**
     * Delete Account
     * @Param AccountRequestDto
     * @Return ResponseDto
     *
     */
    ResponseDto deleteAccount(AccountRequestDto accountRequestDto);
}
