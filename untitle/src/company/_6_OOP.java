package company;

class Emp{
    // In one java file have one Public class
    int id;
    int salary;
    String name;

    public void printD()
    {
        System.out.println("My id is : " + id);
//        System.out.println("Salary is " + salary + "$");
        System.out.println("and My name is : " + name);
    }

    public int getSalary()
    {
        System.out.println("Salary is " + salary + "$");
        return salary;
    }

}
public class _6_OOP {
    public static void main(String[] args) {
        System.out.println("This Is Our Custom Class ");

        Emp hello = new Emp();   // Instantiating a new Emp Object
        Emp hello1 = new Emp();   // Instantiating a new Emp Object

        // Setting Attributes
        hello.id = 34;
        hello.salary = 234;
        hello.name = "Hello World ";

        hello1.id = 134;
        hello1.salary = 534;
        hello1.name = "Hello World Hi ";

        /*
        // Printing The Attributes
        System.out.println(hello.id);
        System.out.println(hello.name);
        */

        hello.printD();
        hello1.printD();

        int salary = hello.getSalary();
        System.out.println("salary : " + salary);

    }
}
