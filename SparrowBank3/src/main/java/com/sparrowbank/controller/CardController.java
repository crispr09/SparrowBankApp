package com.sparrowbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myCard")
public class CardController {

    @GetMapping
    public String getCardInfo() {
        return "this is your card info";
    }
}
