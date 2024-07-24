package com.vyku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyku.entity.BankAccount;
import com.vyku.repository.IBankRepo;

@Service
public class BankMgmtServiceImpl implements IBankMgmtService {
    @Autowired
	private IBankRepo bankRepo;

	@Override
	public String saveCustomer(BankAccount account) {
		int idVal=bankRepo.save(account).getAccNo();
		return "Account Holder is saved with the Id value "+idVal;
	}

}
