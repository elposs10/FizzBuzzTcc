package com.tcc.FizzBuzz.controller;

import java.util.List;

import com.tcc.FizzBuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @GetMapping("/myFizzBuzzList/{number}")
    public List<String> getFizzBuzzList(@PathVariable int number) {
        return fizzBuzzService.getFizzBuzzList(number);
    }
}
