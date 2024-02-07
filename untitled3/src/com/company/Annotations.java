package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
   //void thisMethod2();

}

class NewPhone extends  phone{
    @Override
    public void showtime(){
        System.out.println("Time is 8 PM ");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showtime();
        phone.sum(5, 6);

    }
}
