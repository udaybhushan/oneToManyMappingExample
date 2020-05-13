package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankDetailsEntity;
import com.example.demo.pojo.Address;
import com.example.demo.pojo.BankDetails;
import com.example.demo.service.BankService;

@RestController("/bankcontroller")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@GetMapping("/getBankDetails")
	public ResponseEntity<List<BankDetailsEntity>> getBankDetails() {
		return ResponseEntity.ok(bankService.getBankDetails());
	}
	
	@PostMapping("/addBankDetails")
	public ResponseEntity<BankDetailsEntity> saveBankDetails(@RequestBody BankDetails bankDetails){
		return ResponseEntity.ok(bankService.saveDetails(bankDetails));
	}
	
	@PostMapping("/updateaddress/{id}")
	public ResponseEntity<BankDetailsEntity> updateBankDetails(@RequestBody Address address,@PathVariable int id){
		return ResponseEntity.ok(bankService.UpdateDetails(address, id));
	}
	
	@PostMapping("/updatebankdetails/{id}")
	public ResponseEntity<BankDetailsEntity> updateBankDetails(@PathVariable int id,BankDetails details) throws Exception{
		return ResponseEntity.ok(bankService.updateBankDetails(id,details));
	}
}
