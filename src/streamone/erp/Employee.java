package streamone.erp;

import java.util.Objects;

public class Employee {

  private final PESEL pesel;

  private final String firstName;

  private final String lastName;

  public Employee(PESEL pesel, String firstName, String lastName) {
    Objects.requireNonNull(pesel);
    this.pesel = pesel;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Employee(String pesel, String firstName, String lastName) {
    this(new PESEL(pesel), firstName, lastName);
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;

    Employee employee = (Employee) o;
    return pesel.equals(employee.pesel);
  }

  @Override
  public final int hashCode() {
    return pesel.hashCode();
  }

  @Override
  public String toString() {
    return "Employee{" +
        "pesel=" + pesel +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
