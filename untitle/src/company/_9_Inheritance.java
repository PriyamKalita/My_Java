package company;

class Base{
    int X;

    public int getX() {
        return X;
    }

    public void setX(int x)
    {
        System.out.println("I am in Base and setting X now");
        this.X = x;
    }

    public void printMe()
    {
        System.out.println("I am a Constructor");
    }
}

class Derived extends Base{
    int Y;

    public int getY()
    {
        return Y;
    }

    public void setY(int y)
    {
        this.Y = y;
    }
}
public class _9_Inheritance {
    public static void main(String[] args) {

        // Creating an Object of Base Class
        Base b = new Base();
        b.setX(4);;
        System.out.println(b.getX());

        // Creating an Object of Derived Class
        Derived d = new Derived();
        d.setX(43);;
        System.out.println(d.getX());

    }
}
