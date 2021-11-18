package com.example.lab4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/pickType/{type}")
    @ResponseBody
    public String pickType(@PathVariable String args){
        return null;
    }
}
