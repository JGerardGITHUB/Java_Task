interface tasksheet_1_1_12 {
    double calculateArea();
    double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

      public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
        public abstract double calculateArea();
        public abstract double calculatePerimeter();
}
class Circle extends AbstractShape {
    double radius;

       public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends AbstractShape {
    
        public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 4.0);
        Rectangle rectangle = new Rectangle("Yellow", 3.0, 5.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
