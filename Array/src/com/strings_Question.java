package com;

public class strings_Question {
    //     (1)
//    public static boolean isPalindrome(String str){
//        for (int i = 0; i < str.length() / 2; i++){
//            int n = str.length();
//            if (str.charAt(i) != str.charAt(n - 1 - i)){
//                return false;
//            }
//        }
//        return true;
//    }

    //              (2)
//    public static float getShorestPath(String path){
//        int x = 0, y = 0;
//        for (int i = 0; i < path.length(); i++){
//            char dir = path.charAt(i);
//            // South
//            if (dir == 'S'){
//                y--;
//            }
//            // North
//            else if (dir == 'N'){
//                y++;
//            }
//            // West
//            else if (dir == 'W'){
//                x--;
//            }
//            // East
//            else {
//                x++;
//            }
//        }
//        int x2 = x * x;
//        int y2 = y * y;
//        return (float)Math.sqrt(x2 + y2);
//    }
    public static void main(String[] args) {
        // Question No. 1 : Check it a String is a Palindrome - "racecar", "noon", "madam"
//        String str = "racecar";
//        System.out.println(isPalindrome(str));

        // Question No. 2 : Given a route containing 4 direction (E, W, N, S) Find the shortest path to reach destination - "WNEENESENNN"
//        String path = "WNEENESENNN";
//        System.out.println(getShorestPath(path));

        // Question No. 3 : For a given Set of String , Print the largest strings - "apple", "mango", "banana"
        String fruits[] =  {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++){
            if (largest.compareTo((fruits[i])) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
