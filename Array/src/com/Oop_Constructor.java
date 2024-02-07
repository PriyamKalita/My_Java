package com;

public class Oop_Constructor {
    public static void main(String[] args) {
//        Student s1 = new Student("Priyam");
//        System.out.println(s1.name);

//        Student s1 = new Student();
//        Student s2 = new Student("Priyam Kalita");
//        Student s3 = new Student(12345);

        Student s1 = new Student();
        s1.name = "Priyam Kalita";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 95;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s1.password = "xyz";
        s2.marks[2] = 100;
        for (int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

//class Student{
//    String name;
//    int roll;
//
//    Student(String name){
//        this.name = name;
//        System.out.println("The Constructor is ");
//    }
//}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // (1) Copy Constructor
    // (i) Shallow Copy Constructor
//    Student(Student s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }

    // (ii) Deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // (2) Non-Parameterized Constructor
    Student(){
        marks = new int[3];
        System.out.println("Constructors is Called");
    }

    // (3) Parameterized Constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
