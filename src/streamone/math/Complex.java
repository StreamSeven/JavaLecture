package streamone.math;

public abstract class Complex {

  public static Complex planar(double re, double im) {
    return new PlanarComplex(re, im);
  }

  public  static Complex polar(double modulus, double argument) {
    return new PolarComplex(modulus, argument);
  }

  public abstract double re();

  public abstract double im();

  public abstract double modulus();

  public abstract double argument();

  public abstract Complex asPolar();

  public abstract Complex asPlanar();

  @Override
  public abstract String toString();

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Complex)) return false;

    Complex complex = (Complex) o;

    if (Double.compare(complex.re(), re()) != 0) return false;
    return Double.compare(complex.im(), im()) == 0;
  }

  @Override
  public final int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(re());
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(im());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

}
