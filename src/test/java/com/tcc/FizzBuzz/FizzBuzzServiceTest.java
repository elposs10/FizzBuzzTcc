package com.tcc.FizzBuzz;

import java.util.Arrays;
import java.util.List;

import com.tcc.FizzBuzz.service.FizzBuzzService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FizzBuzzServiceTest {

    private static final Logger l = LogManager.getLogger(FizzBuzzServiceTest.class);

    @Autowired
    private FizzBuzzService fizzBuzzService;


    //Testing the FizzBuzz method with the number 15
    //And asserting that the result matches the expected result list
    @Test
    public void testGetFizzBuzzList() {
        try {
            l.info("### In GetFizzBuzzList(15) ###");
            List<String> expected = Arrays.asList(
                    "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                    "11", "Fizz", "13", "14", "FizzBuzz"
            );
            List<String> actual = fizzBuzzService.getFizzBuzzList(15);
            assertEquals(expected, actual);
            l.info("Success" + actual);
            l.info("### Out of GetFizzBuzzList(15) ###");
        } catch (Exception e) {
            l.error("Error GetFizzBuzzList(15) : " + e);
        }
    }

    //Testing the FizzBuzz method with the number 0
    //And asserting that the result matches the expected result list which is an empty list
    @Test
    public void testGetFizzBuzzListWithZero() {
        try {
            l.info("### In GetFizzBuzzList(0) ###");
            List<String> expected = Arrays.asList();
            List<String> actual = fizzBuzzService.getFizzBuzzList(0);
            assertEquals(expected, actual);
            l.info("Success" + actual);
            l.info("### Out of GetFizzBuzzList(0) ###");
        } catch (Exception e) {
            l.error("Error GetFizzBuzzList(0) : " + e);
        }
    }

    //Testing the FizzBuzz method with the negative number -5
    //And asserting that the result matches the expected result list which is an empty list
    @Test
    public void testGetFizzBuzzListWithNegativeNumber() {
        try {
            l.info("### In GetFizzBuzzList(-5) ###");
            List<String> expected = Arrays.asList();
            List<String> actual = fizzBuzzService.getFizzBuzzList(-5);
            assertEquals(expected, actual);
            l.info("Success" + actual);
            l.info("### Out of GetFizzBuzzList(-5) ###");
        } catch (Exception e) {
            l.error("Error GetFizzBuzzList(-5) : " + e);
        }
    }
}
