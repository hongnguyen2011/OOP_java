package shapes;

public class TestMain {
    public static void main(String[] args) {
        //shape
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("purple");
        System.out.println(shape.getColor());
        shape.setFilled(false);
        System.out.println(shape.isFilled());
        Shape shape1 = new Shape("green", false);
        System.out.println(shape1);
        System.out.println();
        //circle
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3);
        System.out.println(circle);
        circle = new Circle(3, "blue", false);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println();
        //rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setWidth(5);
        rectangle.setLength(6);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 3.4, "green", false);
        System.out.println(rectangle);
        System.out.println();
        //Square

        Square square = new Square();
        System.out.println(square);
        square.setWidth(3);
        System.out.println(square);
        square.setLength(5);
        System.out.println(square.getSide());
        square.setSide(7);
        System.out.println(square.getLength());
        square = new Square(8);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square = new Square(5, "cyan", true);
        System.out.println(square);
    }
}

