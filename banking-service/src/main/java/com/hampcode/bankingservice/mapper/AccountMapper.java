package com.hampcode.bankingservice.mapper;

import com.hampcode.bankingservice.model.dto.AccountResponseDTO;
import com.hampcode.bankingservice.model.entities.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountMapper {
    public List<AccountResponseDTO> convertToListDTO(List<Account> accounts) {
        return accounts.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public AccountResponseDTO convertToDTO(Account it) {
        return new AccountResponseDTO(it.getId(), it.getAccountNumber(), it.getBalance(), it.getOwnerName(), it.getOwnerEmail());
    }
}
