package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practice_Questions_Advanced_Java {
    public static void main(String[] args) {
        /*
        // Question 1 : Create an ArrayList and store names of 10 student in side it .print it using a for-each Loop

        ArrayList ar = new ArrayList();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");

        for (Object o : ar){
            System.out.println(o);
        }
        */



        /*
        // Question 2 : Use the date class in java to print time in the following format :
        //              21 : 47 : 02
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        */



        /*
        // Question 3 :
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        */



        // Question 4 :
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);

        /*
        // Question 5 :Create a set in java Try to store dupluate element inside this set and verify that only one instance is store
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(6);
        s.add(7);
        System.out.println(s);

        */
    }
}
