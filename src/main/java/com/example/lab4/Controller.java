package com.example.lab4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

public class Controller {
    private Service service;
    public ConnectionService connectionService=new ConnectionService();
    String response;
    Converter converter;


    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/conversion/{args}/txt")
    @ResponseBody
    public String getTxt(@PathVariable String args,@PathVariable String type){
        response=connectionService.getConnection(args,"json");//ednpoint do zadania 3
        return service.toTxt(args);
    }
    @GetMapping("/conversion/{args}/json")
    @ResponseBody
    public String getJson(@PathVariable String args,@PathVariable String type){
        response=connectionService.getConnection(args,"json");//ednpoint do zadania 3
        return service.toJson(args);
    }
    @GetMapping("/conversion/{args}/csv")
    @ResponseBody
    public String getCsv(@PathVariable String args,@PathVariable String type){
        response=connectionService.getConnection(args,"json");//ednpoint do zadania 3
        return service.toCsv(args);
    }
    @GetMapping("/conversion/{args}/xml")
    @ResponseBody
    public String getXml(@PathVariable String args,@PathVariable String type){
        response=connectionService.getConnection(args,"json");//ednpoint do zadania 3
       return service.toXml(args);
    }
}
