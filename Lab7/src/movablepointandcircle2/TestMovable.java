package movablepointandcircle2;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        MovableRectangle rectangle = new MovableRectangle(1, 2, 5, 6, 3, 4);
        System.out.println(rectangle);
    }
}
