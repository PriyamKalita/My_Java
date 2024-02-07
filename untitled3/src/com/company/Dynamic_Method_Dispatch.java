package com.company;

class phone{
    public void showtime(){
        System.out.println("Time is 8PM ");
    }
    public void on(){
        System.out.println("Turning on phone ..... ");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("play music");
    }
    public void on(){
        System.out.println("Turning on smartphone ..... ");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.showtime();
        obj.on();
    }
}
