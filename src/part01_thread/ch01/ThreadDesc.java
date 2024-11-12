package part01_thread.ch01;

public class ThreadDesc extends Thread {
  @Override
  public void run() {
    for(int i = 10; i > 0; i--) {
      System.out.println("10부터 1까지 감소 : "+i);
    }
  }
}
