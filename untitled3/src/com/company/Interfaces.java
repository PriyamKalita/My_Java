package com.company;

interface  Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface  HornBicycle{
    int a1 = 245;
    void applyBrake1();
    void speedUp1();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Horn Horn Horn");
    }

    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }

    public void applyBrake1(){
        System.out.println("Applying Brake 1");
    }

    public void speedUp1(){
        System.out.println("Applying SpeedUp 1");
    }
}
public class Interfaces {
    public static void main(String[] args) {

        AvonCycle HelloWorld = new AvonCycle();

        HelloWorld.applyBrake(1);
        HelloWorld.speedUp(31);

        System.out.println(HelloWorld.a);

        HelloWorld.applyBrake1();
        HelloWorld.speedUp1();
        System.out.println(HelloWorld.a1);
    }
}
