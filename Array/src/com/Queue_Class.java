package com;

import javax.swing.*;
import java.util.*;

public class Queue_Class {
//    static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//
//        Queue(int n){
//            arr = new int[n];
//            size = n;
//            rear = -1;
//        }
//        public static boolean isEmpty(){
//            return rear == -1;
//        }
//        // Add
//        public static void add(int data){
//            if (rear == size - 1){
//                System.out.println("Queue is Full");
//                return;
//            }
//            rear = rear + 1;
//            arr[rear] = data;
//        }
//        // Remove
//        public static int remove(){
//            if (isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            int front = arr[0];
//            for (int i = 0; i < rear; i++){
//                arr[i] = arr[i + 1];
//            }
//            rear = rear - 1;
//            return front;
//        }
//        // Peek
//        public static int peek(){
//            if (isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            return arr[0];
//        }
//    }

    //      (1)
//    public static void printNonRepeating(String str){
//        int freq[] = new int[26];
//        Queue <Character> q = new LinkedList<>();
//
//        for (int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            q.add(ch);
//            freq[ch - 'a']++;
//
//            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1){
//                q.remove();
//            }
//            if (q.isEmpty()){
//                System.out.print(-1 + " ");
//            }else {
//                System.out.print(q.peek() + " ");
//            }
//        }
//        System.out.println();
//    }

    //     (2)
//    public static void interLeave(Queue<Integer> q){
//        Queue<Integer> firstHalf = new LinkedList<>();
//        int size = q.size();
//
//        for (int i = 0; i < size / 2; i++){
//            firstHalf.add(q.remove());
//        }
//
//        while (!firstHalf.isEmpty()){
//            q.add(firstHalf.remove());
//            q.add(q.remove());
//        }
//    }

    //     (3)
//    public static void reverse(Queue<Integer> q){
//        Stack<Integer> s = new Stack<>();
//
//        while (!q.isEmpty()){
//            s.push(q.remove());
//        }
//        while (!s.isEmpty()){
//            q.add(s.pop());
//        }
//    }

    public static void main(String[] args) {
//        Queue q = new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }

        // (1) First non-repeating Letter in a stream of charter
//        String str = "aabccxb";
//        printNonRepeating(str);

        // (2) Interleave 2 Halves of a Queue(Even length)
        // 1 2 3 4 5 6 7 8 9 10
        // 1 6 2 7 3 8 4 9 5 10

//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
//
//        interLeave(q);
//
//        // Print Q
//        while (!q.isEmpty()){
//            System.out.print(q.remove() + " ");
//        }
//        System.out.println();

        //       (3) Queue Reversal
//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//
//        reverse(q);
//
//        while (!q.isEmpty()){
//            System.out.print(q.remove() + " ");
//        }
//        System.out.println();
    }
}
