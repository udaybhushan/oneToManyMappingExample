package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BankBranchEntity;
import com.example.demo.entity.BankDetailsEntity;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.BankDetails;
import com.example.demo.repo.BankRepo;

@Service
public class BankService {
	@Autowired
	BankRepo bankrepo;

	public List<BankDetailsEntity> getBankDetails() {
		return bankrepo.findAll();
	}

	public BankDetailsEntity saveDetails(BankDetails bankDetails) {
		BankDetailsEntity bankEntity = new BankDetailsEntity();

		bankEntity.setBankCode(bankDetails.getBankCode());
		bankEntity.setBankName(bankDetails.getBankName());
		List<BankBranchEntity> branchEntitiesList = new ArrayList<BankBranchEntity>();
		BankBranchEntity bankBranchEntity = new BankBranchEntity();

		bankBranchEntity.setBankBranchName("Mehandipatnam");
		bankBranchEntity.setBankBranchPhone("+9123456789012");
		bankBranchEntity.setIfscNumber("IFSC456");

		branchEntitiesList.add(bankBranchEntity);

		// bankEntity.setBankBranch(branchEntitiesList);
		bankBranchEntity.setBank(bankEntity);
		return bankrepo.save(bankEntity);
	}

	public BankDetailsEntity UpdateDetails(Address address, int id) {
		Optional<BankDetailsEntity> bankDetails = bankrepo.findById(4);
		/*
		 * if(bankDetails.isPresent()) { BankDetailsEntity bankDetailsEntity =
		 * bankDetails.get(); bankDetailsEntity.setBankCode("Updated");
		 * List<BankBranchEntity> bankBranchEntitiesList =
		 * bankDetailsEntity.getBankBranch();
		 * bankBranchEntitiesList.stream().filter(bankBranch ->
		 * bankBranch.getBank().getId() == id).forEach( bankBranch ->{
		 * List<AddressEntity> list = new ArrayList<AddressEntity>(); AddressEntity
		 * addressEntity = new AddressEntity();
		 * addressEntity.setAddress1(address.getAddress1());
		 * addressEntity.setAddress2(address.getAddress2());
		 * addressEntity.setArea(address.getArea());
		 * addressEntity.setCity(address.getCity()); list.add(addressEntity);
		 * addressEntity.setBankBranch(bankBranch);
		 * bankBranch.setBankBranchAddress(list); bankBranch.setBank(bankDetailsEntity);
		 * });
		 * 
		 * return bankrepo.save(bankDetailsEntity);
		 * 
		 * } else { return null; }
		 */

		return null;
	}

	public BankDetailsEntity updateBankDetails(int id, BankDetails details) {
		Optional<BankDetailsEntity> bankDetialsOptional = bankrepo.findById(id);
		BankDetailsEntity bankDetails = bankDetialsOptional.get();
		bankDetails.setBankName(details.getBankName());
		bankDetails.setBankCode(details.getBankCode());
		return bankrepo.save(bankDetails);
	}

}
