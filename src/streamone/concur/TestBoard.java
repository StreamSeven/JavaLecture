package streamone.concur;

public class TestBoard {

  public static void main(String... args) {
    Board b = new Board();

    new Thread(() -> {
      while (true) b.write("aaa");
    }).start();
    new Thread(() -> {
      while (true) b.write("bbb");
    }).start();
    new Thread(() -> {
      while (true) b.write("ccc");
    }).start();

    new Thread(() -> {
      while (true) b.read();
    }).start();
    new Thread(() -> {
      while (true) b.read();
    }).start();
    new Thread(() -> {
      while (true) b.read();
    }).start();
    new Thread(() -> {
      while (true) b.read();
    }).start();
    new Thread(() -> {
      while (true) b.read();
    }).start();
  }

}
