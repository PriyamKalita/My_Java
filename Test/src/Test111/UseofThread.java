package Test111;

class Parenthesis {
    void Display(String s) {
        System.out.println("\n");
        System.out.println(" ( "+ s);

        try {
            Thread.sleep(1000);

        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ) ");
    }

}
class MyThread extends Thread {
    String s1;
    Parenthesis p1;

    public MyThread (Parenthesis p2, String s2) {
        p1=p2;
        s1=s2;
        start();
    }
    public void run() {
        p1.Display(s1);
    }

}
public class UseofThread {
    public static void main(String[] args) {
        Parenthesis p3 = new Parenthesis();
        MyThread name1= new MyThread (p3, "Java");
        MyThread name2= new MyThread (p3, "Lab");

        try {
            name1.join();
            name2.join();
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }
}
