package company;

class MyNewEmp
{
    private int id;
    private String name;

    public MyNewEmp()
    {
        id = 34;
        name = "Your-name";
    }
    public MyNewEmp(int n)
    {
        id = n;
        name = "Your-name-Here";
    }
    public MyNewEmp(int n, String myname )
    {
        id = n;
        name = myname;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        this.id = i;
    }
}
public class _8_Contractors {
    public static void main(String[] args) {

        MyNewEmp hello = new MyNewEmp();
        MyNewEmp hello1 = new MyNewEmp(32);
        MyNewEmp hello2 = new MyNewEmp(23, "Good Morning ");

        System.out.println(hello.getId());
        System.out.println(hello.getName());

        System.out.println(hello1.getId());
        System.out.println(hello1.getName());

        System.out.println(hello2.getId());
        System.out.println(hello2.getName());
    }
}
