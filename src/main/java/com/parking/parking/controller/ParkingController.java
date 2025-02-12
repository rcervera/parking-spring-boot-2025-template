package com.parking.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParkingController {
    @GetMapping("/")
    public String principal() {
        return "parking";
    }
}
