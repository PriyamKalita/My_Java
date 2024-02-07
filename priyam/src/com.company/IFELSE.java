package com.company;

public class IFELSE {
    public static void main(String[] args) {



        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        }
        else {
            System.out.println("Good evening.");
        }



        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        }
        else if (time1 < 20) {
            System.out.println("Good day.");
        }
        else {
            System.out.println("Good evening.");
        }



        int time3 = 20;
        String result;
        result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


    }
}
