package com.company;
import java.util.Scanner;

public class SWITCH_STATEMENT {
    public static void main(String[] args) {

//       int age = 56;
//       if(age>56){
//           System.out.println("you are experienced");
//       }
//       else if(age>46){
//           System.out.println("you are semi-experienced");
//       }
//       else if(age>36){
//           System.out.println("you are semi semi experienced");
//       }
//       else {
//           System.out.println("you are not experienced");
//       }


//        int age;
//        System.out.println("enter your age");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        if(age>56){
//            System.out.println("you are experienced");
//        }
//        else if(age>46){
//            System.out.println("you are semi-experienced");
//        }
//        else if(age>36){
//            System.out.println("you are semi semi experienced");
//        }
//        else {
//            System.out.println("you are not experienced");
//        }


//        int age;
//        System.out.println("enter your age");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//
//        switch (age) {
//            case 18:
//                System.out.println("you are going to become an Adult!");
//                break;
//            case 35:
//                System.out.println("you are going to join a job");
//                break;
//            case 60:
//                System.out.println("you are going to get retired");
//                break;
//            default:
//                System.out.println("Enjoy your life");
//
//        }


//        String age1;
//        System.out.println("enter your age");
//        Scanner sc1 = new Scanner(System.in);
//        age1 = sc1.next();
//
//        switch (age1) {
//            case "p":
//                System.out.println("you are going to become an Adult!");
//                break;
//            case "g":
//                System.out.println("you are going to join a job");
//                break;
//            case "i":
//                System.out.println("you are going to get retired");
//                break;
//            default:
//                System.out.println("Enjoy your life");
//
//        }


        String var = "hello world";
        switch (var) {
            case "p":
                System.out.println("you are going to become an Adult!");
                break;
            case "g":
                System.out.println("you are going to join a job");
                break;
            case "i":
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }

//       Switch statement can be replaced with enhanced 'switch'

        String var1 = "hello world";
        switch (var1) {
            case "p" -> System.out.println("you are going to become an Adult!");
            case "g" -> System.out.println("you are going to join a job");
            case "i" -> System.out.println("you are going to get retired");
            default -> System.out.println("Enjoy your life");
        }



    }
}


