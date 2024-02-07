package com.company;

import java.util.Date;

public class Date_class {
    public static void main(String[] args) {
        /*
        // Question : Is it save to store the no. of millisecond in a variable of type long ?
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        */

        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
