public class Square_Qn2 extends Shape {
    public Square_Qn2(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        double result = dim1 * dim2;
        return result;
    }
}
