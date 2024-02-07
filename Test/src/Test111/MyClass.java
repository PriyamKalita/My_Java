package Test111;

public class MyClass {
    private static MyClass instance;

    private MyClass() {
        // Private constructor
    }

    public static MyClass getInstance() {
        if (instance == null) {
            instance = new MyClass();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
