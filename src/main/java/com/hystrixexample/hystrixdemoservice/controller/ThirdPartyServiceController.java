package com.hystrixexample.hystrixdemoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class ThirdPartyServiceController {

    @GetMapping("/numbers")
    public List<Integer> getNumbers(){
        Random random = new Random();
        return new ArrayList<>(Arrays.asList(random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
    }
}
