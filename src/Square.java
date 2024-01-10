public class Square extends Shape{
    private final int a;
    Square(int a){
        this.a=a;
    }
    public int area(){
        try {
            if (a <= 0) {
                throw new InvalidShapeException("Invalid a");
            }
            return a * a;
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }
    }
    public int perimeter(){
        try {
            if (a <= 0) {
                throw new InvalidShapeException("Invalid a");
            }
            return 4*a;
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }

    }
}