public class Program {

  static int foo(int n) {
    return 2 * n + 3;
  }

  static int goo(int n) {
    int m = foo(n) + 1;
    return m + 5;
  }

  public static void main(String[] args) {
    byte b = 5;
    int i = b + 2;
    short s = (short) i;

    double[] tab = {1, 2, 3, 245};

    double[][] m = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}};

    System.out.println(tab.length);
    System.out.println(m.length);

    System.out.println(goo(5));

  }

}
