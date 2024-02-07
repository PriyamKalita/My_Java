package com.company;

class  EKClass{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    EKClass(int a){
       this.a = a;
    }
    public  int returnone(){
        return  1;
    }

}
class Doclass extends  EKClass{
    Doclass(int c){
        super(c);
        System.out.println("I am a ek constructor ");
    }
}
public class THISANDSUPER {
    public static void main(String[] args) {
        EKClass e = new EKClass(5);
        Doclass d = new Doclass(6);
        System.out.println(e.getA());

    }
}
