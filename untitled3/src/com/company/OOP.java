package com.company;

class Employee{

    int id;
    int salary;
    String name;

    public void PrintDetails(){

        System.out.println("My id is " + id);
        System.out.println("And name is " + name);

    }
    public int getSalary(){
        return salary;
    }
}

public class OOP {
    public static void main(String[] args) {

        Employee Hello = new Employee();

        Employee Hello1 = new Employee();

        Hello.id = 12;
        Hello.salary = 12;
        Hello.name = "Hello Wold";

        Hello1.id = 32;
        Hello1.salary= 32;
        Hello1.name = "Hello1 Wold";

        //System.out.println(Hello.id);
        //System.out.println(Hello.name);

        Hello.PrintDetails();

        Hello1.PrintDetails();

        int salary = Hello.salary;
        System.out.println(salary);
    }
}
