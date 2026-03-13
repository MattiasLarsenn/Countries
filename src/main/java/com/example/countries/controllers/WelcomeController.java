package com.example.countries.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    @GetMapping("/")
    public String welcome()
    {
        return "Welcome from Azure CI/CD test!";
    }

    @GetMapping("/Hello")
    public String hello()
    {
        return "Hello, this is the hello endpoint";
    }
}
