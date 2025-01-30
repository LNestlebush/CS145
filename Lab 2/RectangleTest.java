import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four coordinates. Please start in the top left corner and go clockwise. ");
        System.out.print("Enter the x1 coordinate: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y1 coordinate: ");
        double y1 = input.nextDouble();
        System.out.print("Enter the x2 coordinate: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y2 coordinate: ");
        double y2 = input.nextDouble();
        System.out.print("Enter the x3 coordinate: ");
        double x3 = input.nextDouble();
        System.out.print("Enter the y3 coordinate: ");
        double y3 = input.nextDouble();
        System.out.print("Enter the x4 coordinate: ");
        double x4 = input.nextDouble();
        System.out.print("Enter the y4 coordinate: ");
        double y4 = input.nextDouble();
        if (x1 != x4 || x2 != x3 || y1 != y2 || y3 != y4) {
            System.out.println("Invalid input. The coordinates do not form a rectangle.");
        } else {
            RectangleData value = Rectangle.rectangleMath(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println("Length: " + value.getLength());
            System.out.println("Width: " + value.getWidth());
            System.out.println("Area: " + value.getArea());
            System.out.println("Perimeter: " + value.getPerimeter());
            if (value.isSquare()) {
                System.out.println("This rectangle is a square.");
            }
            else {
                System.out.println("This rectangle is not a square.");
            }
        }
 }
}
