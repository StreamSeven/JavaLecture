package streamone.concur;

public final class Promise {

  private boolean pending = true;

  private Object value;

  public synchronized Object get() {
    if (pending) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    return value;
  }

  public synchronized boolean put(Object value) {
    if (pending) {
      pending = false;
      this.value = value;
      this.notifyAll();
      return true;
    }
    return false;
  }

}
