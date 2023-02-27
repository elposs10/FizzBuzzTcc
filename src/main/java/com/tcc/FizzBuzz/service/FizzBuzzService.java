package com.tcc.FizzBuzz.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface FizzBuzzService {
    public List<String> getFizzBuzzList(int number);
}
