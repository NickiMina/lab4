package com.example.lab4;

import org.json.JSONObject;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

public class Converter {
    public String toTxt(String args){
        JSONObject jsonObject = new JSONObject(args);

        return "upperLetters: "+jsonObject.getInt("upperLetters")+"lowerLetters: "+jsonObject.getInt("lowerLetters")+
                "numbers: "+jsonObject.getInt("numbers")+"special characters: "+jsonObject.getInt("specialCharacters");
    }
}
