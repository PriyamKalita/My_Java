package com.company;


class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}



class cellPhone{
    public void ringing(){
        System.out.println("Ringing.....");
    }
    public void vibrating(){
        System.out.println("Vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling Hello World");
    }
}



class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}



class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running from the Enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }

}

public class OOP_Practice_Questions {
    public static void main(String[] args) {

        Employee1 Hello = new Employee1();
        Hello.setName("Hello World");
        Hello.salary = 233;
        System.out.println(Hello.getName());
        System.out.println(Hello.getSalary());



        cellPhone Asus = new cellPhone();
        Asus.callFriend();
        Asus.ringing();
        Asus.vibrating();



        Square sq = new Square();
        sq.side = 3;
        System.out.println("The area of Square : " + sq.area());
        System.out.println("The perimeter of Square : " + sq.perimeter());



        Tommy player = new Tommy();
        player.fire();
        player.run();
        player.hit();
    }
}
