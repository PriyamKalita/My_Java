package com.company;

public class ARRAYS {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        String[] bus = {"Volvo", "BMW", "Ford", "Mazda"};
        bus[0] = "Opel";
        System.out.println(bus[0]);

        //arrays length
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars1.length);

        //loops through an arrays
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars2.length; i++) {
            System.out.println(cars2[i]);
        }

        //Loop Through an Array with For-Each
        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars3) {
            System.out.println(i);
        }



        //Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7


        int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers1.length; ++i)
        {
            for(int j = 0; j < myNumbers1[i].length; ++j)
            {
                System.out.println(myNumbers1[i][j]);
            }
        }



    }
}
