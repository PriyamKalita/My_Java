package company;

class Ekclass{
    int a;

    public int getA()
    {
        return a;
    }

    Ekclass(int v)
    {
        this.a = v;    //this keyword is a reference
    }

    public int returnone()
    {
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int c)
    {
        super(c);
        System.out.println("This is Constructor");
    }
}
public class _11_This_and_Super_keyword {
    public static void main(String[] args) {

        Ekclass E = new Ekclass(76);
        Doclass D = new Doclass(12);

        System.out.println(E.getA());
        System.out.println(D.getA());
    }
}
