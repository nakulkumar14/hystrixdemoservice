package com.hystrixexample.hystrixdemoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ThirdPartyServiceController {

    @GetMapping("/numbers")
    public List<Integer> getNumbers(){
        Random random = new Random();
        return new ArrayList<>(Arrays.asList(random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()));
    }

    @GetMapping("/string")
    public String getString(){
        return UUID.randomUUID().toString();
    }
}
