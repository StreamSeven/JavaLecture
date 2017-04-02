package streamone.concur;

public class TestPromise {

  public static void main(String... args) {
    Promise p = new Promise();
    new Thread(() -> {System.out.println(p.get());}).start();
    new Thread(() -> {System.out.println(p.get());}).start();
    new Thread(() -> {System.out.println(p.get());}).start();
    new Thread(() -> {System.out.println(p.get());}).start();

    new Thread(() -> {System.out.println(p.put(6));}).start();
  }

}
