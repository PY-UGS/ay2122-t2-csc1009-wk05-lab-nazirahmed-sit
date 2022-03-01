public class Main_Qn2 {
    public static void main(String[] args) {
        Rectangle_Qn2 r = new Rectangle_Qn2(9,5);
        Triangle_Qn2 t = new Triangle_Qn2(10,8);
        Circle_Qn2 c = new Circle_Qn2(5,5);
        Ellipse_Qn2 e = new Ellipse_Qn2(7,7);
        Square_Qn2 s = new Square_Qn2(6,6);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());

    }
}
