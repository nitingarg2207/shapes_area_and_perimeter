import java.lang.Math;

public class Ellipse extends Shape{
    private final int minor;
    private final int major;
    Ellipse(int minor, int major){
        this.minor=minor;
        this.major=major;
    }
    public int area(){
        try {
            if (major <= 0 || minor <= 0) {
                throw new InvalidShapeException("Invalid major or minor axis");
            }
            return (int) (pi * minor * major);
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }
    }
    public int perimeter(){
        try {
            if (major <= 0 || minor <= 0) {
                throw new InvalidShapeException("Invalid major or minor axis");
            }
            return (int)(2 * pi * Math.sqrt( (double) (minor + major) / 2 ));
        } catch (InvalidShapeException e) {
            System.out.println(e);
            return -1;
        }
    }
}
