package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamleEndpoint {

    @GetMapping("/info")
    public String info(){
        return "From Spring boot Project";
    }
}
