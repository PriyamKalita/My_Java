package com;

public class Oop_Polymorphism {
    public static void main(String[] args) {

        // (1) Method Overloading
//        Calculator cal = new Calculator();
//        System.out.println(cal.sum(1, 2));
//        System.out.println(cal.sum(1.2f, 2.5f));
//        System.out.println(cal.sum((float)1.2, (float)2.5));
//        System.out.println(cal.sum(1, 2, 3));


        // (2) Method Overridin
        Deer d1 = new Deer();
        d1.eat();
    }
}

// (1) Method Overloading
//class Calculator{
//    int sum(int a, int b){
//        return a + b;
//    }
//    float sum(float a, float b){
//        return a + b;
//    }
//    float sum(int a, int b, int c){
//        return a + b + c;
//    }
//}

// (2) Method Overriding
class Animal3{
    void eat(){
        System.out.println("Eat Anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass");
    }
}
