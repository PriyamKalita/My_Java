package com;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
//
//        BankAccount myAcc = new BankAccount();
//        myAcc.username = "Priyam Kalita";
//        myAcc.setPassword("abcdefghijk");

    }
}




//    class BankAccount{
//        public String username;
//        private String password;
//        public void setPassword(String pwd){
//            password = pwd;
//        }
//    }

    class Pen{
        // Properties + function
        private String color;
        private int tip;

        String getColor(){
            return this.color;
        }

        int getTip(){
            return this.tip;
        }

        void setColor(String Color){
            this.color = Color;
        }

        void setTip(int Tip){
            this.tip = Tip;
        }
    }

//    class Student{
//        String name;
//        int age;
//        float percentage; // CGPA
//        void calPercentage(int phy, int chem, int math){
//            percentage = (phy + chem + math) / 3;
//        }
//    }

