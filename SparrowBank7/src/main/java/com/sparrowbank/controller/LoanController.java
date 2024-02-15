package com.sparrowbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myLoan")
public class LoanController {

    @GetMapping
    public String getLoanInfo() {
        return "This is your loan info..";
    }
}
