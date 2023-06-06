package PractiseOnObject;

import java.util.*;

public class DriverEqualsAndHashCode {
    public static void main(String[] args) {
        Point[] points = new Point[10];
        points[0] = new Point(0, 1);
        points[1] = new Point(1, 1);
        points[2] = new Point(2, 1);
        points[3] = new Point(4, 1);
        points[4] = new Point(5, 1);
        points[5] = new Point(9, 1);
        points[6] = new Point(10, 1);
        points[7] = new Point(0, 1);
        points[8] = new Point(2, 1);
        points[9] = new Point(0, 1);

        HashMap<Point, Integer> hm = new HashMap<>();
        for (Point p : points) {
            if (hm.containsKey(p)) {
                hm.put(p, hm.get(p) + 1);
            } else {
                hm.put(p, 1);
            }
        }


        System.out.println(hm);
        System.out.println(points[0].hashCode());
        System.out.println(points[9].hashCode());

    }

}
