package com.smtek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmiResponse {

	private String loanName;
	private double loanAmount;
	private int noOfTenor;
	private int minTenor;
	private double interestRate;
	private double processingFee;
	private double emiAmount;
	private double intrestAmount;
}
