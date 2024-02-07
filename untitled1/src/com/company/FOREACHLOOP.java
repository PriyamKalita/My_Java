package com.company;

public class FOREACHLOOP {
    public static void main(String[] args) {
//        int [] marks = { 78, 75, 90, 67, 89};
//        float [] marks = {78.5f, 75.5f, 90.5f, 67.0f, 89.5f};
//        String [] marks = {"A", "B", "C", "D", "E"};

//        System.out.println(marks[0]);
//        System.out.println(marks.length);

//      Displaying the array (NAIVE WAY)
//        int [] marks = { 78, 75, 90, 67, 89};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

//      Displaying the array ( FOR LOOP)
        int [] marks = { 78, 75, 90, 67, 89};
        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        for (int i =marks.length-1; i>=0; i--){      // reverse order
            System.out.println(marks[i]);
        }

        for(int element : marks){
            System.out.println(element);             // for each loop
        }




    }
}
