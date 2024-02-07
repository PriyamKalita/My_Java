package com.company;

class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        //System.out.println("My salary is " + salary);
    }

    public int getSalary(){
        return  salary;
    }

}
public class OOP {
    public static void main(String[] args) {
        // Writing a custom class
        System.out.println("This is our custom class");
        Employee helloworld = new Employee(); // Instantiating a new Employee object
        Employee helloworld1 = new Employee(); // Instantiating a new Employee object

        // Setting Attributes for helloworld
        helloworld.id = 12;
        helloworld.name = "hello";
        helloworld.salary = 79;

        // Setting Attributes for helloworld1
        helloworld1.id = 12;
        helloworld1.name = "hello";
        helloworld1.salary = 97;

        // Printing the Attributes
        helloworld.printDetails();
        helloworld1.printDetails();
        int salary = helloworld1.getSalary();
        System.out.println(salary);
//        System.out.println(helloworld.id);
//        System.out.println(helloworld.name);

    }
}
