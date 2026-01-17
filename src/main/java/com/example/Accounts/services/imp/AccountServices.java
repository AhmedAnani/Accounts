package com.example.Accounts.services.imp;

import com.example.Accounts.dto.account.AccountRequestDto;
import com.example.Accounts.dto.account.AccountResponseDto;
import com.example.Accounts.dto.account.AccountsDto;
import com.example.Accounts.dto.golbal.ResponseDto;
import com.example.Accounts.exception.Founded;
import com.example.Accounts.exception.NotFound;
import com.example.Accounts.mapper.AccountMapper;
import com.example.Accounts.model.Account;
import com.example.Accounts.model.User;
import com.example.Accounts.repository.AccountRepository;
import com.example.Accounts.repository.UserRepository;
import com.example.Accounts.services.IAccountServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service @AllArgsConstructor
public class AccountServices implements IAccountServices {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;
    private final UserRepository userRepository;


    @Override
    public ResponseDto createAccount(AccountsDto accountDto) {
       if(accountRepository.existsByUser_Id(accountDto.getUserId())){
           throw new Founded("Already have account.");
       }
        User user = userRepository.findById(accountDto.getUserId())
                .orElseThrow(() -> new NotFound("User not found"));

        Account account=accountMapper.createAccountMapper(user,accountDto);
       accountRepository.save(account);
        return new ResponseDto("Account Created Successfully.");
    }

    @Override
    public AccountResponseDto getAccount(AccountRequestDto accountRequestDto) {
        Account account=accountRepository.findByUser_phone(accountRequestDto.getPhone()).orElseThrow(()->new NotFound("Phone or user doesn't exist."));

        return accountMapper.getAccount(account);
    }

    @Override
    public ResponseDto deleteAccount(AccountRequestDto accountRequestDto) {
        Account account=accountRepository.findByUser_phone(accountRequestDto.getPhone()).orElseThrow(()->new NotFound("Account notFound."));
        accountRepository.deleteById(account.getAccountNumber());

        return new ResponseDto("Account deleted successfully.");
    }
}
