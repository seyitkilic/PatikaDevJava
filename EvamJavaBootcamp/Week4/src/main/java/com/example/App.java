package com.example;

public class App 
{

    public static void main(String[] args) {

        StudentWriteThread w = new StudentWriteThread();
        Thread write = new Thread(w);

        StudentReadThread r = new StudentReadThread();
        Thread read = new Thread(r);

        write.start();
        read.start();
    }
}
