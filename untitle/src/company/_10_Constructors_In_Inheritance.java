package company;

class Base1{
    Base1()
    {
        System.out.println("I am a Constructor");
    }
    Base1(int a)
    {
        System.out.println("I am a overloaded Constructor with value of a as : " + a);
    }
}

class Derived1 extends Base1{
    Derived1()
    {
        //super(3);
        System.out.println("I am a derived class Constructor");
    }
    Derived1(int a, int b)
    {
        super(a);
        System.out.println("I am a overloaded Constructor of Derived with value of b as : " + b);
    }
}

class DerivedOfDerived extends Derived1{

    DerivedOfDerived()
    {
        System.out.println("I am a derivedofderived class Constructor");
    }
    DerivedOfDerived(int a, int b, int c)
    {
        super(a, b);
        System.out.println("I am a overloaded Constructor of Derived with value of c as : " + c);
    }
}
public class _10_Constructors_In_Inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();

        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(4,5);

        //DerivedOfDerived dod = new DerivedOfDerived();
        DerivedOfDerived dod = new DerivedOfDerived(1,2,3);
    }
}
