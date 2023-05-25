package com.example.makemytrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping ("/mybus")
    public String getData()
    {
        return "Please boot ticket here";
    }
}
