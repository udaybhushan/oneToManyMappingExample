package com.example.demo.entity;

import java.time.Instant;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Embeddable
public class BaseEntity {

	@CreatedDate
	@Column(name ="CREATED_ON")
	protected Instant createdOn;
	@CreatedBy
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@LastModifiedDate
	protected Instant modifiedOn;
	@LastModifiedBy
	@Column(name = "MODIFIED_BY")
	protected String modifiedBy;
	@Column(name = "RECORDED_ON")
	protected Instant recordedOn;
	public Instant getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Instant getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Instant modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Instant getRecordedOn() {
		return recordedOn;
	}
	public void setRecordedOn(Instant recordedOn) {
		this.recordedOn = recordedOn;
	}
	
}
