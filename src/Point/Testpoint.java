package Point;

import java.util.Arrays;

public class Testpoint {
    public static void main(String[] args) {
        Point p = new Point();
        p.setXY(1,2);
        System.out.println(Arrays.toString(p.getXY()));
    }
}
