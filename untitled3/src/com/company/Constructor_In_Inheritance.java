package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded Constructor " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of y as : " + y);
    }
}

class  ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of derived with value of z as : " + z);

    }
}

public class Constructor_In_Inheritance {
    public static void main(String[] args) {

//       Derived1 d = new Derived1();
//       Derived1 d1 = new Derived1(15,72);

        //Derived1 d = new Derived1(13, 79);
        //ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd1 = new ChildOfDerived(12, 2, 3);

    }
}
