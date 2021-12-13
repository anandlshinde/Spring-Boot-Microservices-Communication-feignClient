package com.smtek.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smtek.entity.LoanDetails;

@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails, Serializable> {

	public LoanDetails findByLoanName(String loanName);
}
