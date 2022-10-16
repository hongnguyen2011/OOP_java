package themyrectangleandmypoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(0,2,3,0);
        MyRectangle r2 = new MyRectangle(new MyPoint(1,2),new MyPoint(3,5));
        System.out.println("Rectangle 1 "+r1);
        System.out.println("Rectangle 2 " + r2);
        System.out.println("Rectangle p 1 "+ r1.getPerimeter());
        System.out.println("Rectangle p 2" + r2.getPerimeter());
    }
}
