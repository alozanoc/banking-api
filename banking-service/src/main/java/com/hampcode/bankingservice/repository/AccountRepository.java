package com.hampcode.bankingservice.repository;

import com.hampcode.bankingservice.model.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
