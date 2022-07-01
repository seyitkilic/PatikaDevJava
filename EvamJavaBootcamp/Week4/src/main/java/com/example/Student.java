package com.example;

import org.json.simple.JSONObject;

public class Student {
    private String name;
    private String surname;
    private int age;
    
    // Constructors
    public Student(){}
    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public JSONObject toJson(){
        JSONObject obj = new JSONObject();

        obj.put("name", this.name);
        obj.put("surname", this.surname);
        obj.put("age", this.age);

        return obj;
    }

    public Student fromJson(JSONObject obj){
        Student s;
        s = new Student((String) obj.get("name"), (String) obj.get("surname"), 
                        Integer.parseInt( obj.get("age").toString()));

        return s;
    }

    public String toString(){
        return this.name + " " + this.surname + " " + this.age;
    }
    
}
