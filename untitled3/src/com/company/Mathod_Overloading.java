package com.company;

public class Mathod_Overloading {

//    static  void telljoke(){
//        System.out.println("I invented a new word! \n" + "Plagiarism");
//    }

//    static void change(int a){
//        a = 90;
//    }

//    static void change2(int [] arr){
//        arr[0] = 98;
//    }
//    public static void main(String[] args) {
        //telljoke();

        //int [] marks = {52, 73, 77, 89, 98, 94};

          // Changing the array
//        int x = 45;
//        change(x);;
//        System.out.println("The value of x after running change is : " + x);

        // Changing the array
//        change2(marks);
//        System.out.println("The value of x after running change is : " + marks[0]);

    static void foo(){
        System.out.println("Good Morning Bro !");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro ");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " And " + b + " Bro ");
    }

    static void foo(int a, int b, int c){  // a , b, and c are parameter
        System.out.println("Good Morning " + a + b +  " And " + c + " Bro ");
    }

    public static void main(String[] args) {
        foo();
        foo(300);
        foo(300, 400);
        foo(300, 400, 500); // 300, 400, and 500 are Arguments



    }
}
