public class Rectangle_Qn2 extends Shape{

    public Rectangle_Qn2(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        double result = dim1 * dim2;
        return result;
    }

}
