import java.lang.Math.*;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        double resultOfArea;
        resultOfArea = Math.PI * Math.pow(this.radius, 2);
        return resultOfArea;

    }

    public double getPerimeter() {

        double resultOfPerimeter;
        resultOfPerimeter = 2 * Math.PI * this.radius;
        return resultOfPerimeter;

    }

    public double getDiameter() {

        double resultOfDiameter;
        resultOfDiameter = 2 * this.radius;
        return resultOfDiameter;

    }

    public void printCircle() {

    }

}
