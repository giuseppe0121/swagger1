package com.develhope.Esercizo7.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NameController {

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String getName(){
        return "Giuseppe";
    }
}
