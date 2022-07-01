package com.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentWriteThread implements Runnable{
    static List<Student> slist = new ArrayList<>();

    public static void writeJson() throws IOException{
        Services.condition = false;

        JSONArray jarr = new JSONArray();

        for (Student s : slist){
            JSONObject jobj = new JSONObject();
            jobj = s.toJson();
            jarr.add(jobj);
        }

        JSONObject jobj = new JSONObject();
        jobj.put("students", jarr);

        FileWriter f = new FileWriter(Services.path);
        f.write(jobj.toJSONString());
        f.flush();
        Services.condition = true;
    }

    @Override
    public void run() {
        try {
            System.out.println("Yazma islemi calisiyor");
            writeJson();
            System.out.println("Yazma islemi bitti");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
