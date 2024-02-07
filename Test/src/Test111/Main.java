package Test111;

class A{
    public  int enter(){
        return  4;
    }
    public  void  meth2(){
        System.out.println("Method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("Method 2 of class B");
    }
    public void meth3(){
        System.out.println("Method 3 of class B");
    }
}
public class Main {
    public static void main(String[] args) {
                A a = new A();
                a.meth2();

                B b = new B();
                b.meth2();
    }
}
