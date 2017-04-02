package streamone.concur;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Board {

  private static final Random rnd = new Random();

  private final Semaphore s = new Semaphore(Integer.MAX_VALUE, true);

  public void write(Object o) {
    try {
      s.acquire(Integer.MAX_VALUE);
      System.out.println("Pisarz " + Thread.currentThread().getName() + " pisze");
      Thread.sleep(rnd.nextInt(2000));
      System.out.println("Pisarz " + Thread.currentThread().getName() + " zakończył pisanie");
      s.release(Integer.MAX_VALUE);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public Object read() {
    try {
      s.acquire();
      System.out.println("Czytelnik " + Thread.currentThread().getName() + " czyta");
      Thread.sleep(rnd.nextInt(2000));
      System.out.println("Czytelnik " + Thread.currentThread().getName() + " zakończył czytanie");
      s.release();
      return "aaa";
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

}
