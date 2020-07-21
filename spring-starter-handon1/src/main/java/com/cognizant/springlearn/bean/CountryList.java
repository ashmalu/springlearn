package com.cognizant.springlearn.bean;

import java.util.ArrayList;

public class CountryList {
	private ArrayList<Country> countryList=new ArrayList<>();
	public CountryList()
	{
		
	}

	public ArrayList<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<Country> countryList) {
		this.countryList = countryList;
	}

	public CountryList(ArrayList<Country> countryList) {
		super();
		this.countryList = countryList;
	}
	

}
