package part01_thread.ch03;

public class ThreadB extends Thread {
  @Override
  public void run() {
    synchronized (Resource.r2) {
      System.out.println(Thread.currentThread().getName() + " occupies R2 and waits for R1");
      synchronized (Resource.r1) {
        System.out.println(Thread.currentThread().getName() + " occupies R2");
        System.out.println(Thread.currentThread().getName() + " put R1, R2");
      }
    }
  }
}
