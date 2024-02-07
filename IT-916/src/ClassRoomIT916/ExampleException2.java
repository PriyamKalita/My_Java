package ClassRoomIT916;
import java.lang.*;
public class ExampleException2 {
    public static void main(String[] args) {
        try {
            int num[]= {0,1,2,3,4};
            int x = 25 / num[5];
            System.out.println("Does the control reach how");
        }
        catch(ArrayIndexOutOfBoundsException E) {
            System.out.println("Exception Thrown");
            System.out.println(E.getMessage());
        }
    }
}
