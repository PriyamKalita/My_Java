package com.company;

public class BREAKANDCONTINUE {
    public static void main(String[] args) {

        //break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }



        //continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }



        //Break and Continue in While Loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }



        int i1 = 0;
        while (i1 < 10) {
            if (i1 == 4) {
                i1++;
                continue;
            }
            System.out.println(i1);
            i1++;
        }

    }
}
