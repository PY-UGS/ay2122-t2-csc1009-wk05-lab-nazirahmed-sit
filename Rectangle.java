public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double resultArea;
        resultArea = this.width * this.height;
        return resultArea;

    }

    public double getPerimeter() {
        double resultPerimeter;
        resultPerimeter = this.width + this.height + this.width + this.height;
        return resultPerimeter;

    }
}
