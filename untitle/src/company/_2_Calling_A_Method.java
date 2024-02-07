package company;

public class _2_Calling_A_Method {
    int logic(int x, int y){
        int z;

        if (x > y){
            z = x + y;
        }
        else{
            z = x - y;
        }
        return z;
    }
    public static void main(String[] args) {
        // Method Invocation using object creation
        _2_Calling_A_Method obj = new _2_Calling_A_Method();     // Object Creation

        int a = 5;
        int b = 7;
        int c;
        c = obj.logic(a,b);          // Method call upon an object
        System.out.println(c);

        int a1 = 5;
        int b1 = 1;
        int c1;
        c1 = obj.logic(a1,b1);       // Method call upon an object
        System.out.println(c1);
    }
}
