public class Triangle_Qn2 extends Shape{

    public Triangle_Qn2(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        double result = 0.5 * dim1 * dim2;
        return result;
    }
}
