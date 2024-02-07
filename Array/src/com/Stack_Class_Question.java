package com;
import java.util.*;
public class Stack_Class_Question {

    //   (1)
//    public static void pushAtBottom(Stack<Integer> s, int data){
//        if (s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top = s.pop();
//        pushAtBottom(s, data);
//        s.push(top);
//    }

    //  (2) Reverse a String Using Stack
//    public static String reverseString(String str){
//        Stack<Character> s = new Stack<>();
//        int idx = 0;
//        while (idx < str.length()){
//            s.push(str.charAt(idx));
//            idx++;
//        }
//
//        StringBuilder result = new StringBuilder("");
//        while (!s.isEmpty()){
//            char curr = s.pop();
//            result.append(curr);
//        }
//        return result.toString();
//    }

    //     (3)
//    public static void pushAtBottom(Stack<Integer> s, int data){
//        if (s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top = s.pop();
//        pushAtBottom(s, data);
//        s.push(top);
//    }
//
//    public static void reverseStack(Stack<Integer> s){
//        if (s.isEmpty()){
//            return;
//        }
//        int top = s.pop();
//        reverseStack(s);
//        pushAtBottom(s, top);
//    }
//
//    public static void printStack(Stack<Integer> s){
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }

    //     (4)
//    public static void stockSpan(int[] stocks, int[] span){
//        Stack<Integer> s = new Stack<>();
//        span[0] = 1;
//        s.push(0);
//
//        for (int i = 1; i < stocks.length; i++){
//            int currPrice = stocks[i];
//            while (!s.isEmpty() && currPrice > stocks[s.peek()]){
//                s.pop();
//            }
//            if (s.isEmpty()){
//                span[i] = i + 1;
//            }
//            else {
//                int prevHigh = s.peek();
//                span[i] = i - prevHigh;
//            }
//            s.push(i);
//        }
//    }


    public static void main(String[] args) {
        // Question No. (1) : Push at the Bottom of the Stack
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        pushAtBottom(s, 4);
//
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }

        // Question  No. (2) : Reverse a String Using Stack
//        String str = "abc";
//        String result = reverseString(str);
//        System.out.println(result);

        // Question No. (3) : Reverse a Stack
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        printStack(s);
//        reverseStack(s);
//        printStack(s);

        // Question No. (4) : Stack Span Problem
//        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//        int span[] = new int[stocks.length];
//        stockSpan(stocks, span);
//
//        for (int i = 0; i < span.length; i++){
//            System.out.println(span[i] + " ");
//        }

    }
}
