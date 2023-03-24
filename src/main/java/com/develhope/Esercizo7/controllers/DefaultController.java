package com.develhope.Esercizo7.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {


    @RequestMapping(value = "",method = RequestMethod.GET)
    public String defaultController(){
        return "siamo su swagger";
    }
}
