package streamone.math;

class PolarComplex extends Complex {

  private final double modulus;

  private final double argument;

  PolarComplex(double modulus, double argument) {
    this.modulus = modulus;
    this.argument = argument;
  }

  @Override
  public String toString() {
    return modulus() + "\u2220" + argument();
  }

  @Override
  public Complex asPolar() {
    return this;
  }

  @Override
  public Complex asPlanar() {
    return Complex.planar(re(), im());
  }

  @Override
  public double re() {
    return modulus() * Math.cos(argument());
  }

  @Override
  public double im() {
    return modulus() * Math.sin(argument());
  }

  @Override
  public double modulus() {
    return this.modulus;
  }

  @Override
  public double argument() {
    return this.argument;
  }

}
