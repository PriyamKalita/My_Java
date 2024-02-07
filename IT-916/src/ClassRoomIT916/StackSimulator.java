package ClassRoomIT916;
import java.util.*;
public class StackSimulator {
    private ArrayList<Integer> items;
    public StackSimulator() {
        items = new ArrayList<Integer>();
    }
    public void push(int item) {
        items.add(item);
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove(items.size() - 1);
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.get(items.size() - 1);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public int size() {
        return items.size();
    }
}


