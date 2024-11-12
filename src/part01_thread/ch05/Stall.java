package part01_thread.ch05;

import java.util.concurrent.locks.ReentrantLock;

public class Stall {
  ReentrantLock lock = new ReentrantLock();

  public void useStall() {
    lock.lock();
  }

  public void unUseStall() {
    lock.unlock();
  }

  public boolean isLocked() {
    return lock.isLocked();
  }
}
