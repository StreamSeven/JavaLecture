package streamone.equiv;

import java.awt.*;

public class TestPoint {

  public static void main(String... args) {
    Point p1 = new Point(1, 2);
    Point p2 = p1;
    Point p3 = new Point(1, 2);
    Point p4 = new Point(1, 2);

    Point p5 = new Point(3, 4);

    Point p6 = new ColoredPoint(Color.BLACK, 1, 2);

    // 1.
    System.out.println(p1.equals(p1));
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));

    // 2.
    System.out.println(p1.equals(p3));
    System.out.println(p3.equals(p1));

    // 3.
    System.out.println(p1.equals(p3));
    System.out.println(p3.equals(p4));
    System.out.println(p1.equals(p4));

    // 5.
    System.out.println(p1.equals(null));

    // ALERT!!!
    Point p7 = new ColoredPoint(Color.WHITE, 1, 2);
    System.out.println(p6.equals(p7));

    System.out.println(p1.equals(p6));
    System.out.println(p6.equals(p1));
  }

}
