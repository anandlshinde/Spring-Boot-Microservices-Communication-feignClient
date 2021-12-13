package com.smtek.dto;

import lombok.Data;

@Data
public class LoanDetailsResponse {

	private String loanName;
	private double interestRate;
	private double processingFee;
	private int minTenor;
}
