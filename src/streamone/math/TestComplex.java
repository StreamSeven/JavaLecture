package streamone.math;

import java.lang.annotation.Annotation;

public class TestComplex {

  public static void main(String... args) {
    Complex a = Complex.planar(1, 2);
    Complex b = Complex.planar(3, 4);

    System.out.println(a);
    System.out.println(a.asPolar());
    System.out.println(a.asPolar().asPlanar().equals(a));

    // System.out.println(a.add(b));

    Annotation[] anns = LogLevel.class.getAnnotations();
    for (Annotation an : anns) {
      System.out.println(an);
    }


    InTransaction it = LogLevel.class.getAnnotation(InTransaction.class);
    System.out.println(it.isMandatory());

  }

}
