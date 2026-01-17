package com.example.Accounts.mapper;

import com.example.Accounts.dto.account.AccountResponseDto;
import com.example.Accounts.dto.account.AccountsDto;
import com.example.Accounts.model.Account;
import com.example.Accounts.model.User;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public Account createAccountMapper(User user, AccountsDto accountsDto){
        Account account=new Account();

        account.setAccountType(accountsDto.getAccountType());
        account.setBranchAddress(accountsDto.getBranchAddress());
        account.setUser(user);
        return account;
    }

    public AccountResponseDto getAccount(Account account) {

        return  new AccountResponseDto(account.getUser().getName(),
                account.getAccountNumber(),
                account.getAccountType(),
                account.getBranchAddress()
        );
    }
}
