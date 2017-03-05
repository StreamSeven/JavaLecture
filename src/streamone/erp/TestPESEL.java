package streamone.erp;

public class TestPESEL {

  public static void main(String[] args) {
    PESEL p = new PESEL("90051205623");
    PESEL d = new PESEL("90051205623");

    System.out.println(p);
    System.out.println(d);

    System.out.println(p.equals(d));
  }

}
