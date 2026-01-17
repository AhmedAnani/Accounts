package com.example.Accounts.repository;

import com.example.Accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    Boolean existsByUser_Id(int userId);

    Optional<Account> findByUser_phone(String phone);
}
