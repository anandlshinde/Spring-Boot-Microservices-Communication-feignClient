package com.smtek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smtek.dto.LoanResponse;
import com.smtek.entity.LoanDetails;
import com.smtek.repository.LoanDetailsRepository;
import com.smtek.service.ILoanDetailsServie;

@Service
public class LoanDetailsService implements ILoanDetailsServie {

	@Autowired
	private LoanDetailsRepository loanDetailsRepo;
	
	@Override
	public LoanResponse getLoanDetailsByName(String loanName) {
		
		LoanDetails loanDetails = this.loanDetailsRepo.findByLoanName(loanName);
		
		return ConvertEntityToDto(loanDetails);
	}
	
	
	private static LoanResponse ConvertEntityToDto(LoanDetails loanDetails) {
		return new LoanResponse(loanDetails.getLoanName(), loanDetails.getInterestRate(), loanDetails.getProcessingFee(), loanDetails.getMinTenor());
	}

}
