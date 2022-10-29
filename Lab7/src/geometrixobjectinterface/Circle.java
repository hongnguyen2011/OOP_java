package geometrixobjectinterface;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle [radius=%s]",
                this.radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
