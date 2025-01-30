public class RectangleData {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    public RectangleData(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double length, double width, double area, double perimeter) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.length = length;
        this.width = width;
        this.area = area;
        this.perimeter = perimeter;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }
    public void setX3(double x3) {
        this.x3 = x3;
    }
    public void setY3(double y3) {
        this.y3 = y3;
    }
    public void setX4(double x4) {
        this.x4 = x4;
    }
    public void setY4(double y4) {
        this.y4 = y4;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public double getX1() {
        return x1;
    }
    public double getY1() {
        return y1;
    }
    public double getX2() {
        return x2;
    }
    public double getY2() {
        return y2;
    }
    public double getX3() {
        return x3;
    }
    public double getY3() {
        return y3;
    }
    public double getX4() {
        return x4;
    }
    public double getY4() {
        return y4;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public boolean isSquare() {
        return length == width;
    }
}
