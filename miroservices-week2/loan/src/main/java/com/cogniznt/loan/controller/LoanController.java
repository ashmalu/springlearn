package com.cogniznt.loan.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cogniznt.loan.model.Loan;

@RestController
public class LoanController {
	public static ArrayList<Loan> ln=new ArrayList<>();
	static
	{
		ln.add(new Loan(12345,"car",400000,8000,18));
		ln.add(new Loan(123456,"home",4000000,8000,12));
		ln.add(new Loan(1234,"bike",40000,800,18));
	}
	@GetMapping("/loans/{number}")
	public Loan getLoanById(@PathVariable long number)
	{
		for(Loan l:ln)
		{
			if(l.getNumber()==number)
			{
				return l;
			}
		}
		return null;
	}

}
