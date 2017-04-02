package streamone.concur;

import java.util.concurrent.atomic.AtomicBoolean;

public class Select {

  public static Object select(AtomicBoolean stop, Promise p, Downloader... ds) {
    for (Downloader d : ds) {
      new Thread(d).start();
    }
    Object value = p.get();
    stop.set(true);
    return value;
  }

}
