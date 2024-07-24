package com.vyku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyku.entity.BankAccount;

public interface IBankRepo extends JpaRepository<BankAccount, Integer> {

}
