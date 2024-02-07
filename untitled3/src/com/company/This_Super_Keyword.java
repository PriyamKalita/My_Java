package com.company;

class EKclass{
    int a;

    public int getA() {
        return a;
    }

    EKclass (int a){
        this.a = a;
    }

    public int returnone(){
        return 1;
    }
}

class Declass extends EKclass{
    Declass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }
}


public class This_Super_Keyword {
    public static void main(String[] args) {
        EKclass e = new EKclass(5);
        Declass d = new Declass(75);

        System.out.println(e.getA());
        System.out.println(d.getA());
    }
}
