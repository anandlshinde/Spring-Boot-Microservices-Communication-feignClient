package com.smtek.service;

import com.smtek.dto.LoanResponse;

public interface ILoanDetailsServie {

	public LoanResponse getLoanDetailsByName(String loanName);
}
