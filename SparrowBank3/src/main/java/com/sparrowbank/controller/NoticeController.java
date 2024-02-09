package com.sparrowbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
public class NoticeController {

    @GetMapping
    public String getNoticeInfo() {
        return "This is your notice info...";
    }
}
