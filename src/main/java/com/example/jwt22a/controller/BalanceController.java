package com.example.jwt22a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalacneDetails() {
        return "Here are the balancedetails from db";
    }

}
