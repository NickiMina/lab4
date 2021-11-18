package com.example.lab4;

import org.springframework.web.client.RestTemplate;

public class ConnectionService {

    public String getConnection(String args, String type){
        final String uri = "http://localhost:8081/nowy/"+args+"/"+type;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

}
