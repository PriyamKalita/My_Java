package company;

class MyEmp
{
    private int id;
    private String name;

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
public class _7_Access_modifiers_Getters_And_Setters {
    public static void main(String[] args) {

//        hello.id = 76;                  // Throws an error due to private access modifiers
//        hello.name = "Good Morning";    // Throws an error due to private access modifiers

        MyEmp hello = new MyEmp();

        hello.setName("Good Morning");
        System.out.println(hello.getName());

        hello.setId(23);
        System.out.println(hello.getId());

    }
}
