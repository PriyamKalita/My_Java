package ClassRoomIT916;

public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    public class InnerClass {
        private int innerField;

        public InnerClass() {
            this.innerField = 5;
        }

        public void innerMethod() {
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }


    public static void main(String[] args) {
        OuterClass outer = new OuterClass(53);
        outer.outerMethod();
    }
}