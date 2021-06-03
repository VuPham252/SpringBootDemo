package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        this.accountRepository.save(account);
    }

    
    
}
