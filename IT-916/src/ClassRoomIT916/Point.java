package ClassRoomIT916;

public class Point {
    private int px;
    private int py;
    void input(int x,int y) {
        px = x;
        py = y;
    }
    void show() {
        System.out.println("("+px+","+py+")");
    }
}
