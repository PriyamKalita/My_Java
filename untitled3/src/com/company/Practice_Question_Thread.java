/*
package com.company;

// Q1: Write a program to print " Good Morning " and " Welcome "
//     continuously on the screen in java using Threads

class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println(" Good Morning ");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
        while(true){
            System.out.println(" Welcome ");
        }
    }
}

public class Practice_Question_Thread {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();

        p1.start();
        p2.start();
*/



/*
package com.company;
// Q2 : Add a sleep method in welcome Thread of Questions to dealay
//      its execution for 200ms

class Practice13 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(" Good Morning ");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
        while(true){
            System.out.println(" Welcome ");
        }
    }
}
public class Practice_Question_Thread {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();

        p1.start();
        p2.start();
    }
}
*/



/*
// Q3 : Demonstrate getPriority() and setPriority() methods in java Thread
package com.company;

class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
//        while(true){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class Practice_Question_Thread {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
//        p1.setPriority(6);
//        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

//        p1.start();
//        p2.start();

    }
}
*/



/*
// Q4 : How do you get state of a given thread in java?
package com.company;

class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class Practice_Question_Thread {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
    }
}
*/

// Q4 : How do you get refarence to the current thread in java
package com.company;

class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class Practice_Question_Thread {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}