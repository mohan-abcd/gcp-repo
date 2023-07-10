package com.oneabc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name = "t_professionaldetails")
public class ProfessionalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
     
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid")
	private Customer customer;

    @Column(name = "employmenttype", length = 20)
    @NotBlank(message = "Please provide employment type.")
    private String employmentType;


    @Column(name = "companyname", length = 20)
    @NotBlank(message = "Please provide company name.")
    private String companyName;

    @Column(name = "annualincome")
    //@NotBlank(message = "Please provide annual income.")
    private Double annualIncome;

    @Column(name = "totalworkexperience")
    private Integer totalWorkExperience;
    
    
    @Column(name = "createdby", length = 50)
	private String createdBy;

	 
	@Column(name = "createddate")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdDate;

	@Column(name = "modifiedby", length = 50)
	private String modifiedBy;
	 
 
	@Column(name = "modifieddate")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime modifiedDate;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getEmploymentType() {
		return employmentType;
	}


	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Double getAnnualIncome() {
		return annualIncome;
	}


	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}


	public Integer getTotalWorkExperience() {
		return totalWorkExperience;
	}


	public void setTotalWorkExperience(Integer totalWorkExperience) {
		this.totalWorkExperience = totalWorkExperience;
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


	public ProfessionalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProfessionalDetails(long id, Customer customer,
			@NotBlank(message = "Please provide employment type.") String employmentType,
			@NotBlank(message = "Please provide company name.") String companyName, Double annualIncome,
			Integer totalWorkExperience, String createdBy, LocalDateTime createdDate, String modifiedBy,
			LocalDateTime modifiedDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.employmentType = employmentType;
		this.companyName = companyName;
		this.annualIncome = annualIncome;
		this.totalWorkExperience = totalWorkExperience;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	
	
	
	
	
    
    
    
    
}
