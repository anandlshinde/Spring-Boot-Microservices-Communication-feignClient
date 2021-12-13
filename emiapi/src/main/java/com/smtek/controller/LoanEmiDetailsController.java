package com.smtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smtek.dto.EmiResponse;
import com.smtek.service.IEmiService;

@RestController
public class LoanEmiDetailsController {

	@Autowired
	private IEmiService iEmiService;
	
	@GetMapping("/loanEmiDetails/{loanName}/{loanAmount}/{noOfTenor}")
	public ResponseEntity<EmiResponse> getLoanEmiDetails(@PathVariable String loanName,@PathVariable double loanAmount,@PathVariable int noOfTenor){
		EmiResponse loanDetails = this.iEmiService.getLoanDetails(loanName, loanAmount, noOfTenor);
		return new ResponseEntity<EmiResponse>(loanDetails,HttpStatus.OK);
	}
}
