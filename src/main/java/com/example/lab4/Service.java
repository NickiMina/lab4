package com.example.lab4;

import org.json.JSONObject;

@org.springframework.stereotype.Service
public class Service {
    public String toTxt(String args){
        JSONObject jsonObject = new JSONObject(args);

        return "upperLetters: "+jsonObject.getInt("upperLetters")+"lowerLetters: "+jsonObject.getInt("lowerLetters")+
                "numbers: "+jsonObject.getInt("numbers")+"special characters: "+jsonObject.getInt("specialCharacters");
    }
    public String toJson(String args){
        return args;
    }
    public String toCsv(String args){
        JSONObject jsonObject = new JSONObject(args);
        String str = """
        Upper_letters,Lower_letters, Numbers, Special_characters
        %d,%d,%d,%d
        """;
        return String.format(str,jsonObject.getString("upperLetters"),
                jsonObject.getString("lowerLetters"),jsonObject.getString("numbers"),jsonObject.getString("specialCharacters"));
    }

    public String toXml(String args) {
        JSONObject jsonObject = new JSONObject(args);
        String str = """
        <Response>
        <Upper_letters>%d</Upper_letters>,
        <Lower_letters>%d</Lower_letters>,
        <Numbers>%d</Numbers>,
        <Special_characters>%d</Special_characters>,
        </Response>
        """;
        return String.format(str,jsonObject.getString("upperLetters"),
                jsonObject.getString("lowerLetters"),jsonObject.getString("numbers"),jsonObject.getString("specialCharacters"));
    }
}
