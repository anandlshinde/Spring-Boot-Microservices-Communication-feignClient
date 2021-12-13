package com.smtek.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient("loan-api")
public interface LoanApiFeignClient {
	@GetMapping("/loanapi/loanDetailsByName/{loanName}")
	public ResponseEntity<String> getLoanDetails(@PathVariable String loanName);
}
