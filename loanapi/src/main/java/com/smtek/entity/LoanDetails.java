package com.smtek.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_loan_info")
public class LoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="loan_id")
	private int loanId;
	
	@Column(name="loan_name")
	private String loanName;
	
	@Column(name="interest_rate")
	private double interestRate;
	
	@Column(name="processing_fee")
	private double processingFee;
	
	@Column(name="min_tenor")
	private int minTenor;
}
