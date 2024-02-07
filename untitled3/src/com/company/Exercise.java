package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
       // 0 for Rock
       // 1 for Paper
       // 2 for Scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock ,1 for Paper , 2 for Scissor : ");
        int uerInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (uerInput == computerInput){
            System.out.println("Draw");
        }
        else if (uerInput == 0 && computerInput == 2 || uerInput == 1 && computerInput == 0 || uerInput == 2 && computerInput == 1){
            System.out.println("You Win");
        }
        else {
            System.out.println("Computer Win");
        }

        System.out.println("Computer Choice : " + computerInput);

    }
}
