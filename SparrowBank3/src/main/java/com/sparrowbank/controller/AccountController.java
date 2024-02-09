package com.sparrowbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myAccount")
public class AccountController {

    @GetMapping
    public String getAccountInfo() {
        return "This is your account details..";
    }
}
