package com.tcc.FizzBuzz.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

    //This is the logic that I implemented to solve the FizzBuzz test
    //With a complexity of O(n)
    @Override
    public List<String> getFizzBuzzList(int number) {
        List<String> result = new ArrayList<>();
        //Iterating from 1 to the provided number
        for (int i = 1; i <= number; i++) {
            //Checking if the number is divided by 3 and 5, and adding FizzBuzz to the output
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            }
            //Checking if the number is divided by 3, and adding Fizz to the output
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            //Checking if the number is divided by 5, and adding Buzz to the output
            else if (i % 5 == 0) {
                result.add("Buzz");
            }
            //Adding the number as it is to the output since it doesn't fulfill the previous conditions
            else {
                result.add(String.valueOf(i));
            }
        }
        //Returning the final result
        return result;
    }
}