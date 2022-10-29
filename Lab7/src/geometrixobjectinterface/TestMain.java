package geometrixobjectinterface;

import java.lang.management.ManagementFactory;

public class TestMain {
    public static void main(String[] args) {
        //Test circle
        GeometricObject geomObj1 = new Circle(5.0);
        System.out.println(geomObj1);
        System.out.println("Perimeter = "+geomObj1.getPerimeter());
        System.out.println("Area = "+geomObj1.getArea());
        //Test rectangle
        GeometricObject geomObj2 = new Rectangle(5,6);
        System.out.println(geomObj2);
        System.out.println("Perimeter = "+geomObj2.getPerimeter());
        System.out.println("Area = "+geomObj2.getArea());
    }
}
