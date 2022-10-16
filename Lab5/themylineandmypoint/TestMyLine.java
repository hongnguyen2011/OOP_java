package themylineandmypoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1);

        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);
        MyLine line2   = new MyLine(point1, point2);
        System.out.println(line2);

        System.out.println("Line 1 length: " + line1.getLength());
        System.out.println("Line 1 gradient: " + line1.getGradient());

        System.out.println("Line 2 length: " + line2.getLength());
        System.out.println("Line 2 gradient: " + line2.getGradient());
    }
}
