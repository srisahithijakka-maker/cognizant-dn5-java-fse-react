package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryService {

    public Country getCountry(String code) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        context.close();

        if (country.getCode().equalsIgnoreCase(code)) {
            return country;
        }

        return null;
    }
}