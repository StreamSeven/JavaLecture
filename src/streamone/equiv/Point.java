package streamone.equiv;

public class Point {

  final double x;

  final double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Point)) return false;

    Point point = (Point) o;

    if (Double.compare(point.x, x) != 0) return false;
    return Double.compare(point.y, y) == 0;
  }

  @Override
  public final int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(x);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(y);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
