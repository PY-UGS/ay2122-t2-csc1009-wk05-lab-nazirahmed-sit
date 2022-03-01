public class Circle_Qn2 extends Shape{

    public Circle_Qn2(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        double result = PI * dim1 * dim2;
        return result;
    }
}
