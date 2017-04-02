package streamone.concur;

import java.util.concurrent.atomic.AtomicBoolean;

public class Downloader implements Runnable {

  private final AtomicBoolean stop;

  private final Promise p;

  private final int steps;

  private final long sleep;

  private final char symbol;

  public Downloader(AtomicBoolean stop, Promise p, int steps, long sleep, char symbol) {
    this.stop = stop;
    this.p = p;
    this.steps = steps;
    this.sleep = sleep;
    this.symbol = symbol;
  }

  @Override
  public void run() {
    for(int i = 0; i < steps; i++) {
      if(stop.get()) return;
      System.out.print(symbol);
      try {
        Thread.sleep(sleep);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    p.put(sleep * steps);
  }

}
