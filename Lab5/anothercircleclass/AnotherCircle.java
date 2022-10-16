package anothercircleclass;

public class AnotherCircle {
    private double radius;
    private String color;

    public AnotherCircle() {

        radius = 1.0;
    }

    public AnotherCircle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return radius * Math.PI * 2.00;
    }

    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
