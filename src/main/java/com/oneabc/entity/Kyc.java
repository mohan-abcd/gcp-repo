package com.oneabc.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "t_kyc")
public class Kyc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerid")
	@JsonBackReference
	private Customer customer;

	@Column(name = "permanentaddress")
	private String permanentAddress;

	@Column(name = "digilockerstatus", length = 100)
	private String digilockerStatus;

	@Column(name = "digilockercreateddate")
	private String digilockerCreatedDate;

	@Column(name = "videokyc")
	private String videoKYC;

	@Column(name = "lastfetcheddt")
	@Temporal(TemporalType.DATE)
	private LocalDate lastFetchedDT;

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

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getDigilockerStatus() {
		return digilockerStatus;
	}

	public void setDigilockerStatus(String digilockerStatus) {
		this.digilockerStatus = digilockerStatus;
	}

	public String getDigilockerCreatedDate() {
		return digilockerCreatedDate;
	}

	public void setDigilockerCreatedDate(String digilockerCreatedDate) {
		this.digilockerCreatedDate = digilockerCreatedDate;
	}

	public String getVideoKYC() {
		return videoKYC;
	}

	public void setVideoKYC(String videoKYC) {
		this.videoKYC = videoKYC;
	}

	public LocalDate getLastFetchedDT() {
		return lastFetchedDT;
	}

	public void setLastFetchedDT(LocalDate lastFetchedDT) {
		this.lastFetchedDT = lastFetchedDT;
	}

	public Kyc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kyc(long id, Customer customer, String permanentAddress, String digilockerStatus,
			String digilockerCreatedDate, String videoKYC, LocalDate lastFetchedDT) {
		super();
		this.id = id;
		this.customer = customer;
		this.permanentAddress = permanentAddress;
		this.digilockerStatus = digilockerStatus;
		this.digilockerCreatedDate = digilockerCreatedDate;
		this.videoKYC = videoKYC;
		this.lastFetchedDT = lastFetchedDT;
	}

}
