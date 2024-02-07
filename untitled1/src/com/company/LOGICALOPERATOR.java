package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class LOGICALOPERATOR {
    public static void main(String[] args) {
        System.out.println("For LOGICAL AND .....");
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        System.out.println("For LOGICAL OR .....");
        boolean a1 = true;
        boolean b1 = false;
        if(a1 || b1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


        System.out.println("For LOGICAL NOT ......");
        System.out.println("not(a) is ");
        System.out.println(!a);
        System.out.println("not(b) is ");
        System.out.println(!b);

    }
}
