package Test111;
class MyThreadOneMore extends Thread {
    String name;
    MyThreadOneMore (String tname){
        name = tname;
        start();
    }
    public void run() {
        try {
            for(int i= 0; i<10; i++) {
                System.out.println(name+ ":"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Existing"+name);
    }

}
public class SusRes {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        MyThreadOneMore T1 = new MyThreadOneMore("First");
        try {
            Thread.sleep(500);
            T1.suspend();
            System.out.println("First Suspended");
            T1.resume();
            System.out.println("First Resumed");
            Thread.sleep(500);
            System.out.println("First Thread suspended");
            T1.stop();
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Existing Main");
    }
}
