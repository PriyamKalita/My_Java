package ClassRoomIT916;
import java.util.*;
import java.io.*;
public class UsingEmpAgain {
    private String name;
    private int salary;

    public static void main(String[] args) {
        UsingEmpAgain e1=new UsingEmpAgain();
        e1.input("Hari",200000);
        UsingEmpAgain e2=new UsingEmpAgain();
        e2.input("Juhi",250000);

        if(e1.getsal()>e2.getsal()) {
            System.out.println("n"+e1.getname()+"'s salary is higher");
        } else {
            System.out.println("n"+e2.getname()+"'s salary is higher");
        }
    }

    public void input(String n, int s) {
        name = n;
        salary = s;
    }

    public int getsal() {
        return salary;
    }

    public String getname() {
        return name;
    }
}
