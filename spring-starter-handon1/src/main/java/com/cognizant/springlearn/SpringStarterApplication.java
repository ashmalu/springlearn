package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.bean.CountryList;
import com.cognizant.springlearn.bean.DateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class SpringStarterApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringStarterApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
		displayDate();
		displayCountry();
		displayCountries();
	}
	public static void displayDate()
	{

		ApplicationContext context = 

				new ClassPathXmlApplicationContext("date-format.xml");
		DateFormat df= (DateFormat) context.getBean("dateFormat");
		LOGGER.info("START");
		LOGGER.debug(df+" ");
		LOGGER.info("END");
		//System.out.println("The date is:"+df.getDate());
	}
	public static void displayCountry()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=(Country) context.getBean("country");
		Country anoterCountry=(Country) context.getBean("country");
		LOGGER.debug("Country:"+country);
		
		
	}
	public static void displayCountries()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		CountryList country=(CountryList) context.getBean("countrylist");
		for(Country cl:country.getCountryList())
		LOGGER.debug(cl+" ");
	}

}
