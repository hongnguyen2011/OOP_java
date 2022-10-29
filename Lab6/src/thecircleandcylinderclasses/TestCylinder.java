package thecircleandcylinderclasses;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:" + " radius=" + cylinder1.getRadius() + " height=" + cylinder1.getHeight() + "base area=" + cylinder1.getArea() + " volume=" + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder:" + " radius=" + cylinder2.getRadius());
        Cylinder cylinder3 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder:" + " radius=" + cylinder3.getRadius() + " height=" + cylinder3.getHeight() + " base area=" + cylinder3.getArea()+ " volume=" + cylinder3.getVolume());
    }
}
