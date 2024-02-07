package com.company;

public class abc18 {
    public static void main(String[] args) {
        //MULTIDIMENSIONAL ARRAYS IN LOOP
        int [] marks;        // 1-D ARRAY
        int [][] flats;      // 2-D ARRAY
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("printing 2-D array");
        for(int i=0; i<flats.length; i++){
            for(int j = 0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");
        }



    }
}


