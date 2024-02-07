package ClassRoomIT916;
import java.lang.*;
public class ExampleException {
    public static void main(String[] args) {
            try {
                int num;
                num = Integer.parseInt("ABC123");
                System.out.println("Does the control reach here ");
            }
            catch(NumberFormatException E){
                System.out.println("Exception thrown");
                System.out.println(E.getMessage());
            }
        }
}
