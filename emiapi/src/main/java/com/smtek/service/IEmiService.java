package com.smtek.service;

import com.smtek.dto.EmiResponse;

public interface IEmiService {

	public EmiResponse getLoanDetails(String loanName,double loanAmount,int noOfTenor);
}
