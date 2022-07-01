package com.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentReadThread implements Runnable{
    static List<Student> slist = new ArrayList<>();
    
    public static List<Student> readJson() throws IOException, ParseException, InterruptedException{
        JSONParser parser = new JSONParser();

        FileReader reader = new FileReader(Services.path);

        Object obj = parser.parse(reader);
        JSONObject jobj = (JSONObject) obj;
        JSONArray arr = (JSONArray) jobj.get("students");

        System.out.println(jobj.get("students"));
        Thread.sleep(1000);

        for (Object o : arr){
            if (o instanceof JSONObject){
                parseObject((JSONObject)o);
            }
        }

        return slist;
    }

    private static void parseObject(JSONObject jobj){
        Student s = new Student();
        s = s.fromJson(jobj);
        slist.add(s);
        System.out.println(s);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (Services.condition){
            try {
                System.out.println("Okuma islemi calisiyor");
                readJson();
                System.out.println("Okuma islemi bitti");
            } catch(Exception e){
                e.getMessage();
            }
        }
    }
}
