package ClassRoomIT916;
import java.util.*;
import java.io.*;
public class UsingPrivateClass {
    private class Point {
        private int cx;
        private int cy;

        public void input(int x, int y) {
            cx=x;
            cy=y;
        }

        public void show() {
            System.out.println("cx="+cx);
            System.out.println("cy="+cy);
        }
    }

    public static void main(String[] args) {
        UsingPrivateClass d = new UsingPrivateClass();
        Point p = d.new Point();
        p.input(20, 30);
        p.show();
    }
}
