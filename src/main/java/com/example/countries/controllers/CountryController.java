package com.example.countries.controllers;

import com.example.countries.models.Country;                // CHANGE ME!
import com.example.countries.services.CountryService;       // CHANGE ME!
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class CountryController
{

    private final CountryService countryService;

    public CountryController(CountryService countryService)
    {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries()
    {
        return countryService.getAllCountries();
    }

    @GetMapping("/db-test")
    @ResponseBody
    public String dbTest()
    {
        return countryService.testConnection();
    }

}
