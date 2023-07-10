package com.oneabc.entity;

 
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "t_address")
public class Address {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	@Column(name = "typeofaddress",length = 20)
	private String typeOfAddress;
	
	@Column(name = "addresslineone")
	private String addressLineOne;

	@Column(name = "addresslinetwo")
	private String addressLineTwo;

	@Column(name = "state",length = 50)
	private  String state;

	@Column(name = "city",length = 50)
	private String city;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "pincode",length = 10)
	private String pincode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid")
	@JsonBackReference
	private Customer customer;
	
	@Column(name = "createdby",length = 50)
	private String createdBy;

	 
	@Column(name = "createddate")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdDate;

	@Column(name = "modifiedby",length = 50)
	private String modifiedBy;
	 
	@JsonDeserialize(using = DateHandler.class)
	@Column(name = "modifieddate")
	private LocalDateTime modifiedDate;


	@Column(name = "active",length = 5)
	private String active;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTypeOfAddress() {
		return typeOfAddress;
	}


	public void setTypeOfAddress(String typeOfAddress) {
		this.typeOfAddress = typeOfAddress;
	}


	public String getAddressLineOne() {
		return addressLineOne;
	}


	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}


	public String getAddressLineTwo() {
		return addressLineTwo;
	}


	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(long id, String typeOfAddress, String addressLineOne, String addressLineTwo, String state,
			String city, String landmark, String pincode, Customer customer, String createdBy,
			LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate, String active) {
		super();
		this.id = id;
		this.typeOfAddress = typeOfAddress;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.state = state;
		this.city = city;
		this.landmark = landmark;
		this.pincode = pincode;
		this.customer = customer;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.active = active;
	}
	
	

	 
	 

}
