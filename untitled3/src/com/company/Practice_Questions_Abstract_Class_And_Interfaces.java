package com.company;

/*
abstract class pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing The Nib");
    }
}
*/



class Monkey{
    void jump(){
        System.out.println("Jumping ....");
    }
    void bite(){
        System.out.println("Biting ....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello World");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}


public class Practice_Questions_Abstract_Class_And_Interfaces {
    public static void main(String[] args) {
        // Create an abstract class pen with methods write() and refill() as abstract method
        // Use the Pen class from Q1 to create a concrete class Fountain pen with additional method changeNiB()
/*
        FountainPen pen = new FountainPen();
        pen.changeNib();
*/

        // Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods
        Human h = new Human();
        h.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        BasicAnimal HHH = new Human();
        HHH.eat();
        HHH.sleep();

    }
}
