package com.cognizant.springlearn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.springlearn.SpringStarterApplication;

public class Country {
	public Country() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringStarterApplication.class);
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
		LOGGER.debug("Inside the set code");
	}

	public String getName() {
		return name;

	}

	public Country(String code, String name) {
		super();
		LOGGER.debug("Inside the country constructor");
		this.code = code;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
		LOGGER.debug("inside the set name");
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
}
