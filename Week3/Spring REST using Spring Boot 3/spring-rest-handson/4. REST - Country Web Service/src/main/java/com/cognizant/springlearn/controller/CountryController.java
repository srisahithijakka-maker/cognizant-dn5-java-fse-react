package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @GetMapping("/country")
    public Country getCountry() {

        LOGGER.info("START");

        CountryService service = new CountryService();
        Country country = service.getCountry();

        LOGGER.debug("Country : {}", country);

        LOGGER.info("END");

        return country;
    }
}