// Create a Java class Rectangle with attributes length and width. Implement methods to calculate the area and perimeter of the rectangle. Create objects of the class and demonstrate these methods.
public class Question2 {
    double length;
    double width;

    public Question2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Question2 rectangle = new Question2(5.0, 3.0);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
