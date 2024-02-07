package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();   // This is the Date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");   // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using Date and Format
        String myDate2 = dt.format(df2);

        System.out.println(myDate);
        System.out.println(myDate2);

    }
}
