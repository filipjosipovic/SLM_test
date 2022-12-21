package com.example.slm_test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/percentage")
public class Controller {

    private final PercService Service;
    public Controller(PercService Service) {
        this.Service = Service;
    }


    @GetMapping
    public int getPercentage(
            @RequestParam(defaultValue = "0", required = false) int perc) {
        return Service.getPercentage(perc);
    }
}
