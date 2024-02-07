package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
//        int i = 0;
//        while (i < 30) {
//
//            System.out.println("I am a Thread");
//            i++;
//        }
    }
}
public class Thread_Class {
    public static void main(String[] args) {
        MyThr t = new MyThr("Hello");
        t.start();
        System.out.println("The id of the thread t is " + t.getId());
        System.out.println("The name of the thread t is " + t.getName());
    }
}
