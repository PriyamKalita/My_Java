package com.company;

class MyNewThr1 extends Thread{
    public void run(){
    int i = 0;
    while(i<3000){
        System.out.println("Thank you1 ");
        i++;
      }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 300){
            System.out.println("Thank you ");
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();

        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();

    }
}
