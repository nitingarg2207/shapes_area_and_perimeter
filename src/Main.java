public class Main {
    public static void main(String[] args) {
        Ellipse a = new Ellipse(10,15);
        System.out.println(a.area());
        System.out.println(a.perimeter());

        Shape c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}