package com.company;

class circle{
    public int radius;

    circle(){
        System.out.println("I Am Non Param Of Circle");
    }

    circle(int r){
        System.out.println("I Am Circle Parameterized Constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*radius*this.radius;
    }
}

class cylinder extends circle{
    cylinder(int r, int h){
        //super(r);
        System.out.println("I Am Cylinder Parameterized Constructor");
        this.height = h;
    }

    public int height;
    public double volume(){
        return Math.PI*radius*this.radius*this.height;
    }
}

public class Practice_Inheritance {
    public static void main(String[] args) {

        cylinder obj = new cylinder(12,3);

//        circle obj = new circle(12);


    }
}
