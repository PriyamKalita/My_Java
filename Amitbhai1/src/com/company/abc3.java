package com.company;

public class abc3 {
    public static void main(String[] args) {

    /*   byte x = 5;
         int y = 8;
         short z = 7;
         int a = y = z;
         float b = 6.54f +x;
        System.out.println(a);
        System.out.println(b);  */

        //  R = b + s --> int
        //  R = s + i --> int
        //  R = l + f --> float
        //  R = i + f --> float
        //  R = c + i --> int
        //  R = c + s --> int
        //  R = l + d --> double
        //  R = f + d --> double

        // b --> byte
        // f --> float
        // s --> short
        // d --> double
        // i --> integer
        // c --> character
        // l --> long

        //    INCREMENT AND DECREMENT OPERATORS
        int i = 58;
        //int b = i++;   ( first b is assigned i (58) then i is incremented)
        int j = 68;
        int c = ++j;   // First j is incremented then c is assigned j (69)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int y = 7;
        System.out.println( ++y *8);

        char ch = 'a';
        System.out.println(ch);
        System.out.println(++ch);

    }
}
