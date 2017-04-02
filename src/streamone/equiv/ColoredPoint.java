package streamone.equiv;

import java.awt.*;
import java.util.Objects;

public class ColoredPoint extends Point {

  private final Color color;

  public ColoredPoint(Color color, double x, double y) {
    super(x, y);
    Objects.requireNonNull(color);
    this.color = color;
  }

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof ColoredPoint)) return false;
//    if (!super.equals(o)) return false;
//
//    ColoredPoint that = (ColoredPoint) o;
//
//    return color.equals(that.color);
//  }
//
//  @Override
//  public int hashCode() {
//    int result = super.hashCode();
//    result = 31 * result + color.hashCode();
//    return result;
//  }
}
