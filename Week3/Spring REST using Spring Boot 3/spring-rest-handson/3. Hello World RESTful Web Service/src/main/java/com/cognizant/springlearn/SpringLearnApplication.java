package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);

		displayCountry();
	}

	public static void displayCountry() {

		LOGGER.info("START");

		CountryService service = new CountryService();

		Country country = service.getCountry();

		LOGGER.debug("Country : {}", country);

		LOGGER.info("END");
	}
}