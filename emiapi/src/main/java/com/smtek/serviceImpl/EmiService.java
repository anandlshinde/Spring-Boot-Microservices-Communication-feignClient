package com.smtek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smtek.client.LoanApiFeignClient;
import com.smtek.dto.EmiResponse;
import com.smtek.dto.LoanDetailsResponse;
import com.smtek.service.IEmiService;

@Service
public class EmiService implements IEmiService{
	
	@Autowired
	private LoanApiFeignClient loanApiFeignClient;
	
	@Autowired
	private ObjectMapper objMapper;

	@Override
	public EmiResponse getLoanDetails(String loanName, double loanAmount, int noOfTenor) {
		
		ResponseEntity<String> loanDetails = this.loanApiFeignClient.getLoanDetails(loanName);
		LoanDetailsResponse detailsResponse=null;
		try {
			 detailsResponse = this.objMapper.readValue(loanDetails.getBody(), LoanDetailsResponse.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return calculateEmi(detailsResponse, loanAmount, noOfTenor);
	}
	
	
	private static EmiResponse calculateEmi(LoanDetailsResponse loanDetailsResponse,double loanAmount,int noOfTenor) {
		
		String loanName = loanDetailsResponse.getLoanName();
		
		double interestRate = loanDetailsResponse.getInterestRate();
		
		int minTenor = loanDetailsResponse.getMinTenor();
		
		double processingFee = loanDetailsResponse.getProcessingFee();
		
		double intrestAmount=(loanAmount*interestRate*(noOfTenor/12)/100);
		
		double emiAmount=(loanAmount+intrestAmount)/noOfTenor;
		
		EmiResponse emiResponse=new EmiResponse(loanName, loanAmount, noOfTenor, minTenor, interestRate, processingFee, emiAmount,intrestAmount);
		
		return emiResponse;
	}

	
}
