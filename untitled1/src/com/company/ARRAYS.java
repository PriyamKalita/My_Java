package com.company;

public class ARRAYS {
    public static void main(String[] args) {
        /* Classroom of 500 student  - You have to store marks of these 500 student
           You have 2 option :
           (1) Create 500 variable
           (2) Use ARRAYS (recommended) */

        // There are three amin ways to create an array in java

        //  (1) Declaration and  memory Allocation !
        //int [] marks = new int[5];

        //  (1) Declaration and then memory Allocation !
        int [] marks;
        marks = new int [5];

        // Initialization
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[4]);
        System.out.println(marks[1]);

        // (3) Declaration , memory Allocation and Initialization together!
        int [] marks1 = {78, 78, 98, 67, 97};
        System.out.println(marks[4]);


    }
}
