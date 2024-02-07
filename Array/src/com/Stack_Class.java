package com;

import java.util.ArrayList;
import java.util.*;

public class Stack_Class {
    // (1) Linked List
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static class Stack{
//        static Node head = null;
//
//        public static boolean isEmpty(){
//            return head == null;
//        }
//
//        // Push
//        public static void push(int data){
//            Node newNode = new Node(data);
//
//            if (isEmpty()){
//                head = newNode;
//                return;
//            }
//            newNode.next = head;
//            head = newNode;
//        }
//
//        // Pop
//        public static int pop(){
//            if (isEmpty()){
//                return -1;
//            }
//
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//
//        // peek
//        public static int peek(){
//            if (isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }

        // (2) Stack Using ArrayList
//        static ArrayList<Integer> list = new ArrayList<>();
//        public static boolean isEmpty(){
//            return list.size() == 0;
//        }
//
//        // Push
//        public static void push(int data){
//            list.add(data);
//        }
//
//        // Poop
//        public static int poop(){
//            if (isEmpty()){
//                return -1;
//            }
//            int top = list.get(list.size() - 1);
//            list.remove(list.size() - 1);
//            return top;
//        }
//
//        // Peek
//        public static int peek(){
//            if (isEmpty()){
//                return -1;
//            }
//            return list.get(list.size() - 1);
//        }
//    }
    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }

        Stack<Integer> s = new Stack<>();    // Using Java Collection Framework
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
