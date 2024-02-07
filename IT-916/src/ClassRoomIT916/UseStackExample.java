package ClassRoomIT916;

public class UseStackExample {
    public static void main(String[] args) {
        StackSimulator stack = new StackSimulator();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
    }



