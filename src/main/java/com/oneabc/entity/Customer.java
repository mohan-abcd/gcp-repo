package com.oneabc.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 
@Entity
@Table(name = "t_customer")
public class Customer {

	// @Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "customer_seq_gen")
	// @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_seq")

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "mobilenumber", unique = true)
	private String mobileNumber;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "dateofbirth")
	@Temporal(TemporalType.DATE)
	private LocalDate dateOfBirth;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Kyc> kycCoustomer;

	@Column(name = "loantype", length = 50)
	private String loanType;

	@Column(name = "pannumber", length = 10)
	private String panNumber;

	@Column(name = "aadhaarnumber", length = 20)
	private String aadhaarNumber;

	@Column(name = "email", length = 100)
	private String email;

	@Column(name = "gender", length = 15)
	private String gender;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Address> address;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "occupationid")
	private OccupationType occupationType;

	@Column(name = "nricustomer", length = 1)
	private boolean nriCustomer;

	@Column(name = "createdby", length = 100)
	private String createdBy;

	@Column(name = "createddate")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdDate;

	@Column(name = "modifiedby", length = 20)
	private String modifiedBy;

	@Column(name = "modifieddate")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime modifiedDate;

	@Column(name = "active", length = 5)
	private String active;

	@Column(name = "enabledha", length = 5)
	private String enableDHA;

	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private PinMgt mpin;

	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private ProfessionalDetails professionalDetails;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Kyc> getKycCoustomer() {
		return kycCoustomer;
	}

	public void setKycCoustomer(List<Kyc> kycCoustomer) {
		this.kycCoustomer = kycCoustomer;
	}

 

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public OccupationType getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(OccupationType occupationType) {
		this.occupationType = occupationType;
	}

	public boolean isNriCustomer() {
		return nriCustomer;
	}

	public void setNriCustomer(boolean nriCustomer) {
		this.nriCustomer = nriCustomer;
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

	public String getEnableDHA() {
		return enableDHA;
	}

	public void setEnableDHA(String enableDHA) {
		this.enableDHA = enableDHA;
	}

	public PinMgt getMpin() {
		return mpin;
	}

	public void setMpin(PinMgt mpin) {
		this.mpin = mpin;
	}

	public ProfessionalDetails getProfessionalDetails() {
		return professionalDetails;
	}

	public void setProfessionalDetails(ProfessionalDetails professionalDetails) {
		this.professionalDetails = professionalDetails;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long id, String mobileNumber, String firstName, String lastName, LocalDate dateOfBirth,
			List<Kyc> kycCoustomer, String loanType, String panNumber, String aadhaarNumber, String email,
			String gender, List<Address> address, OccupationType occupationType, boolean nriCustomer, String createdBy,
			LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate, String active, String enableDHA,
			PinMgt mpin, ProfessionalDetails professionalDetails) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.kycCoustomer = kycCoustomer;
		this.loanType = loanType;
		this.panNumber = panNumber;
		this.aadhaarNumber = aadhaarNumber;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.occupationType = occupationType;
		this.nriCustomer = nriCustomer;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.active = active;
		this.enableDHA = enableDHA;
		this.mpin = mpin;
		this.professionalDetails = professionalDetails;
	}

	 
	
	

}
