package company;

public class _3_Method_Overloading {

    /*
//    static void change2(int[] arr){
//        arr[0] = 98;
//    }

//    static  void change(int a){
//        a = 98;
//    }

//    static void tellJoke(){
//        System.out.println("I invented a new Word! : " + "Plagiarism ");
//    }
     */



    static void foo(){
        System.out.println("Good Morning ");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a );
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a +" " + b);
    }

    public static void main(String[] args) {
        foo();
        foo(23);
        foo(34, 5);



        //tellJoke();

        /*
        // CASE 1 : Changing The Integer
        int x = 45;
        change(x);
        System.out.println("The value of X after running change is : " + x);
        */

        /*
        // CASE 2 : Changing The Array
        int [] marks = {12, 232, 33, 223, 4324, 333};
        change2(marks);
        System.out.println("The value of X after running change is : " + marks[0]);
        */



    }
}
