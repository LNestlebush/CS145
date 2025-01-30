public class Rectangle {
    public static RectangleData rectangleMath(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double line1 = x2 - x1;
        double line2 = y2 -y3;
        double length;
        double width;
        double area;
        double perimeter;

        if (line1 > line2) {
           length = line1;
            width = line2;
        } else {
            length = line2;
            width = line1;
        }
        area = length * width;
        perimeter = 2 * (length + width);
        return new RectangleData(x1, y1, x2, y2, x3, y3, x4, y4, length, width, area, perimeter);
    }
}
