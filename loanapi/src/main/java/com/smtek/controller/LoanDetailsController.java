package com.smtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smtek.dto.LoanResponse;
import com.smtek.service.ILoanDetailsServie;

@RestController
public class LoanDetailsController {

	@Autowired
	private ILoanDetailsServie iLoanDetailsServie;
	
	
	@GetMapping("/loanDetailsByName/{loanName}")
	public ResponseEntity<LoanResponse> getLoanDetails(@PathVariable String loanName){
	 LoanResponse loanResponse = this.iLoanDetailsServie.getLoanDetailsByName(loanName);
	 return new ResponseEntity<LoanResponse>(loanResponse,HttpStatus.OK);
	}
	
}
