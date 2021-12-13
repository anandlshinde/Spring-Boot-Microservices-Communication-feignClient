package com.smtek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {

	private String loanName;
	private double interestRate;
	private double processingFee;
	private int minTenor;
}
