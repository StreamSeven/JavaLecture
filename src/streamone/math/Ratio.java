package streamone.math;

public class Ratio {

  private interface F {
    long get(int field);
  }

  public static F make(final long num, final long denom) {
    return (field) -> field == 0 ? num : denom;
//    return new F() {
//      @Override
//      public long get(int field) {
//        return field == 0 ? num : denom;
//      }
//    };
  }

  public static long num(F x) {
    return x.get(0);
  }

  public static long denom(F x) {
    return x.get(1);
  }

  public static F mul(F x, F y) {
    return make(num(x) * num(y), denom(x) * denom(y));
  }

  public static void main(String... args) {
    // F f = new F();
  }
}
