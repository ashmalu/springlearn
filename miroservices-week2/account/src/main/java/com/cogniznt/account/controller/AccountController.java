package com.cogniznt.account.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cogniznt.account.model.Account;

@RestController
public class AccountController {
	static ArrayList<Account> act=new ArrayList<>();
	static
	{
		
		act.add(new Account(123456,"saving",85686));
		act.add(new Account(1235,"saving",43245));
		act.add(new Account(1234,"saving",23234));
	}
	@GetMapping("/accounts/{number}")
	public Account getActByNum(@PathVariable long number)
	{
	       for(Account a:act)
	       {
	    	   if(a.getNumber()==number)
	    		   return a;
	       }
	        
	    	return   null;
	}
	

}
