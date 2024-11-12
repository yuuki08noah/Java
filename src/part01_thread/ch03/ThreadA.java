package part01_thread.ch03;

public class ThreadA extends Thread {
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    synchronized (Resource.r1) {
      System.out.println(Thread.currentThread().getName() + " occupies R1 and waits for R2");
      synchronized (Resource.r2) {
        System.out.println(Thread.currentThread().getName() + " occupies R1");
        System.out.println(Thread.currentThread().getName() + " put R1, R2");
      }
    }
  }
}
