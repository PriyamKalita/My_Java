package com.company;


// Question 1 :
//class Cylinder{
//    private int radius;
//    private int height;
//
//    public Cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public double surfaceArea(){
//        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
//    }
//
//    public double volume(){
//        return 2*Math.PI*radius*radius*height;
//    }
// }
    class Rectangle{
        private int length;
        private int breadth;

        public Rectangle() {
            this.length = 4;
            this.breadth = 5;
        }

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }

public class Practice_AccessModifiers_Getters_Setters {
    public static void main(String[] args) {

        // Question 1 :
        // Create a class Cylinder and user getters and Setters to set its radius and height
//        Cylinder MyCylinder = new Cylinder(12,13);
//        //MyCylinder.setHeight(12);
//        System.out.println(MyCylinder.getHeight());
//
//        //MyCylinder.setRadius(9);
//        System.out.println(MyCylinder.getRadius());
//
//        System.out.println(MyCylinder.surfaceArea());
//        System.out.println(MyCylinder.volume());

        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());



    }
}