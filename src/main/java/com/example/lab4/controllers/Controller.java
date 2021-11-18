package com.example.lab4.controllers;

import com.example.lab4.ConnectionService;
import com.example.lab4.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    private Service service;
    public ConnectionService connectionService=new ConnectionService();
    String response;


    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/conversion/{args}/txt")
    public String getTxt(@PathVariable String args){
        response=connectionService.getConnection(args,"json");//endpoint do poprzedniego zadania
        return service.toTxt(response);
    }
    @GetMapping("/conversion/{args}/json")
    public String getJson(@PathVariable String args){
        response=connectionService.getConnection(args,"json");
        return service.toJson(response);
    }
    @GetMapping("/conversion/{args}/csv")
    public String getCsv(@PathVariable String args){
        response=connectionService.getConnection(args,"json");
        return service.toCsv(response);
    }
    @GetMapping("/conversion/{args}/xml")
    public String getXml(@PathVariable String args){
        response=connectionService.getConnection(args,"json");
       return service.toXml(response);
    }
}
