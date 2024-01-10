public class Rectangle extends Shape{
    private final int l;
    private final int b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public int area() {
        try {
            if (l <= 0 || b <= 0) {
                throw new InvalidShapeException("Invalid l or b");
            }
            return l * b;
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }
    }
    public int perimeter(){
        try {
            if (l <= 0 || b <= 0) {
                throw new InvalidShapeException("Invalid l or b");
            }
            return 2 * (l + b);
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }
    }
}