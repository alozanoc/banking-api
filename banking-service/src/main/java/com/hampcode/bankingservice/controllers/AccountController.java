package com.hampcode.bankingservice.controllers;
import com.hampcode.bankingservice.model.dto.AccountResponseDTO;
import com.hampcode.bankingservice.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@AllArgsConstructor
public class AccountController {
    final AccountService accountService;
    @GetMapping("/accounts")
    public ResponseEntity<List<AccountResponseDTO>> getAllAccount() {
        return new ResponseEntity<>(this.accountService.getAllAccounts(), HttpStatus.OK);
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<AccountResponseDTO> getAccountById(@PathVariable Long id) {
        AccountResponseDTO account = accountService.getAccountById(id);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
