package streamone.concur;

public class TestThreads {

  public static void main(String... args) {
    Thread t0 = new Thread(() -> {
      for(int i = 0; i < 10; i++) {
        System.out.println("A teraz jesteśmy w wątku " + Thread.currentThread().toString());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println("Przewano mi, więc kończę działanie.");
          return;
        }
      }
    });
    // t0.setDaemon(true);
    t0.start();

    System.out.println("Jesteśmy w wątku " + Thread.currentThread().toString());
    try {
      t0.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Tutaj wątek t0 już zakończył działanie");
  }

}
