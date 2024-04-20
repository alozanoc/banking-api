package com.hampcode.bankingservice.services;

import com.hampcode.bankingservice.exceptions.ResourceNotFoundException;
import com.hampcode.bankingservice.mapper.AccountMapper;
import com.hampcode.bankingservice.model.dto.AccountResponseDTO;
import com.hampcode.bankingservice.model.entities.Account;
import com.hampcode.bankingservice.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {

    final AccountRepository accountRepository;
    final AccountMapper accountMapper;

    @Transactional(readOnly = true)
    public List<AccountResponseDTO> getAllAccounts(){
        List<Account> accounts = accountRepository.findAll();
        return accountMapper.convertToListDTO(accounts);
    }

    @Transactional(readOnly = true)
    public AccountResponseDTO getAccountById(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cuenta no encontrada con el numero: "+id));
        return accountMapper.convertToDTO(account);


    }

}
