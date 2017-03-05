package streamone.erp;

import java.util.regex.Pattern;

public final class PESEL {

  private static final Pattern p =
      Pattern.compile("[0-9]{4}[0-3]{1}[0-9]{1}[0-9]{5}");

  public static boolean isValid(String pesel) {
    return p.matcher(pesel).matches();
  }

  private final long pesel;

  public PESEL(String pesel) {
    if (!isValid(pesel)) throw new IllegalArgumentException("Invalid PESEL: " + pesel);
    this.pesel = Long.valueOf(pesel);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return pesel == ((PESEL) o).pesel;
  }

  @Override
  public int hashCode() {
    return (int) (pesel ^ (pesel >>> 32));
  }

  @Override
  public String toString() {
    return "PESEL{" + pesel + '}';
  }
}