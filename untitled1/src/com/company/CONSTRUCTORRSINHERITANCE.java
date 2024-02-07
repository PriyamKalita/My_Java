package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor");

    }
    Base1(int x){
        System.out.println("I am a overloaded constructor with value of x as : " + x);
    }

}
class Derived1 extends  Base1{
    public  int y;
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");

    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a overloaded constructor of Derived with value of y as : " + y);

    }
}

class childDerived extends  Derived1{
    childDerived(){
        System.out.println("I am a chile of derived constructor");
    }
    childDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am a child of derived constructor of Derived with value of z as : " + z);
    }
}
public class CONSTRUCTORRSINHERITANCE {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 b1 = new Derived1();
//        Derived1 d = new Derived1(34,79);
        childDerived cd = new childDerived(37,67,78);
    }
}
