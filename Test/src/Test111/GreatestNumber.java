package Test111;

public class GreatestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }
    }
}
