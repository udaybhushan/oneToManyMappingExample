package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name ="bankDetailsEntiy")
@Table(name = "BANK_DETAILS")
public class BankDetailsEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String bankName;
	@Column
	private String bankCode;
	@Embedded
	private BaseEntity baseEntity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BaseEntity getBaseEntity() {
		return baseEntity;
	}
	public void setBaseEntity(BaseEntity baseEntity) {
		this.baseEntity = baseEntity;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	

}
