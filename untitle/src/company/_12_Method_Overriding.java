package company;

class A{
    public int a;
    public int Hello()
    {
        return 3;
    }
    public void Meth2()
    {
        System.out.println("I am a Method 2 of class A");
    }
}

class B extends A{
    @Override
    public void Meth2()
    {
        System.out.println("I am a Method 2 of class B");
    }
    public void Meth3()
    {
        System.out.println("I am a Method 3 of class B");
    }
}
public class _12_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.Meth2();

        B b = new B();
        b.Meth2();
    }
}
