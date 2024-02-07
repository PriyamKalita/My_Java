package company;

class one{
    public void greet()
    {
        System.out.println("Hello World");
    }
    public void name()
    {
        System.out.println("Hello World Hi");
    }
}

class two extends one{
    public void Sweet()
    {
        System.out.println("Hello World in class two 123");
    }
    public void name()
    {
        System.out.println("Hello World in class two");
    }
}
public class _13_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        one obj = new two();
        obj.name();
    }
}
