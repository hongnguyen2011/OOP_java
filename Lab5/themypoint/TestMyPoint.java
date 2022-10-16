package themypoint;

import java.awt.*;

public class TestMyPoint {

    public static void test() {
        MyPoint point1 = new MyPoint();
        System.out.println(point1);
        point1.setX(6);
        point1.setY(8);
        System.out.println("x is :" + point1.getX());
        System.out.println("y is  :" + point1.getY());
        point1.setXY(3, 0);
        System.out.println(point1.getXY()[0]);
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);
        MyPoint point2 = new MyPoint(0, 4);
        System.out.println(point2);
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        System.out.println(point1.distance(5, 6));
//        System.out.println(point1.distance());
    }

    public static void printtenPoint() {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i, i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(points[i].toString());
        }
    }

    public static void main(String[] args) {
        test();
        printtenPoint();
    }
}
