package streamone.concur;

import java.util.concurrent.atomic.AtomicBoolean;

public class TestDownloader {

  public static void main(String... args) {
    AtomicBoolean stop = new AtomicBoolean(false);
    Promise p = new Promise();

    Downloader d1 = new Downloader(stop, p, 30, 200, '+');
    Downloader d2 = new Downloader(stop, p, 60, 200, '-');
    Downloader d3 = new Downloader(stop, p, 10, 200, '=');

    System.out.println("Odebrałem " + Select.select(stop, p, d1, d2, d3));

  }

}
