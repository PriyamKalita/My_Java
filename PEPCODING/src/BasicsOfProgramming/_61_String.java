package BasicsOfProgramming;

import java.util.Scanner;

public class _61_String {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        //String s1 = scn.next();
        //String s2 = scn.nextLine();

        //String s1 = "Hello";

        //System.out.println(s1);

//        System.out.println(s2);
//        System.out.println(s2.length());

//        char ch = s2.charAt(1);
//        System.out.println(ch);

//        for (int i = 0; i < s2.length(); i++)
//        {
//            char ch = s2.charAt(i);
//            System.out.println(ch);
//        }

//        String s = "abcd";
//        System.out.println(s.substring(0,0));
//        System.out.println(s.substring(1,1));
//        System.out.println(s.substring(2,2));
//
//        System.out.println(s.substring(0, 1));
//        System.out.println(s.substring(1, 4));
//        System.out.println(s.substring(2, 3));
//
//        System.out.println(s.substring(1));
//        System.out.println(s.substring(0));
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(2));

//        String s1 = "abcd";
//        for (int i = 0; i < s1.length(); i++)
//        {
//            for (int j = i + 1; j <= s1.length(); j++)
//            {
//                System.out.println(s1.substring(i, j));
//            }
//        }

//        String s1 = "Hello";
//        String s2 = " World";
//        String s3 = s1 + s2;
//        System.out.println(s3);

//        String s1 = "Hello";
//        s1 += ' ';
//        s1 += 'W';
//        s1 += 'o';
//        s1 += 'r';
//        s1 += 'l';
//        s1 += 'd';
//        System.out.println(s1);

//        System.out.println("Hello" + 10 + 20);
//        System.out.println(10 + 20 + "Hello");

        String s1 = "abc def ghi jkl mno";
        String[] parts = s1.split(" ");
        for (int i = 0; i < parts.length; i++)
        {
            System.out.println(parts[i]);
        }

    }
}
