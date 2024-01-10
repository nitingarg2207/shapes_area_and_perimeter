public class Circle extends Shape{
    private final int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public int area(){
        try {
            if (radius<=0) {
                throw new InvalidShapeException("Invalid radius");
            }
            return (int)(pi*radius*radius);
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }
    }
    public int perimeter(){
            try {
                if (radius <= 0) {
                    throw new InvalidShapeException("Invalid radius");
                }
                return (int)(2*pi*radius);
            } catch (InvalidShapeException e) {
                System.out.println(e);
                return -1;
            }
    }
}
