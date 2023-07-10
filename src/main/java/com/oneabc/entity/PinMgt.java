package com.oneabc.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
import lombok.Data;

@Entity
@Table(name = "T_PINMGT")
@Data
public class PinMgt {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "currentmpin")
	private String currentMpin;

	@Column(name = "mpinexpiry")
	private Date mpinExpiry;

	@Column(name = "createdby", length = 100)
	private String createdBy;

	 
	@Column(name = "createddate")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdDate;

	@Column(name = "modifiedby", length = 100)
	private String modifiedBy;
	 
	@JsonDeserialize(using = DateHandler.class)
	@Column(name = "modifieddate")
	private LocalDateTime modifiedDate;

	
	@Column(name = "active", length = 5)
	private String active;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid")
	private Customer customer;
	
}
