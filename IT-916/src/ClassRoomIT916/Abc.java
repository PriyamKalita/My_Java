package ClassRoomIT916;
final class myFinalClass {
    void myFinalMethod() {
        System.out.println("Final Class");
    }
}

public class Abc {
    public static void main(String[] args) {
        myFinalClass fc = new myFinalClass();
        fc.myFinalMethod();
    }
}
