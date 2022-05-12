package com.example.CodingAssessment.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class RewardsController {

    public int dollarsSpent = 70;

    @RequestMapping("/test")
    public String test() {
        return "hello w0rld";
    }

    @RequestMapping("/points")
    public int points() {
        if (dollarsSpent > 150) {
            return (dollarsSpent - 50) + (dollarsSpent - 150);
        }
        else if (dollarsSpent > 50) {
            return dollarsSpent - 50;
        }
        else {
            return 0;
        }
    }

}
