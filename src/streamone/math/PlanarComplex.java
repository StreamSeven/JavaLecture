package streamone.math;

class PlanarComplex extends Complex {

  private final double re;

  private final double im;

  PlanarComplex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder("(");
    buf.append(re()).append("+").append(im()).append("j");
    return buf.append(")").toString();
  }

  @Override
  public Complex asPolar() {
    return Complex.polar(modulus(), argument());
  }

  @Override
  public Complex asPlanar() {
    return this;
  }

  @Override
  public double re() {
    return this.re;
  }

  @Override
  public double im() {
    return this.im;
  }

  @Override
  public double modulus() {
    return Math.sqrt(re() * re() + im() * im());
  }

  @Override
  public double argument() {
    return Math.atan2(im(), re());
  }
}
