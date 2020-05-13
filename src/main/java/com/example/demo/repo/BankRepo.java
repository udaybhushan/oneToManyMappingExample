package com.example.demo.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BankDetailsEntity;

@Repository
public interface BankRepo extends JpaRepository<BankDetailsEntity,Integer>{

	

}
