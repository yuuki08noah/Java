package part01_thread.ch01;

public class ThreadAsc implements Runnable {
  @Override
  public void run() {
    for(int i = 1; i <= 10; i++) {
      System.out.println("1부터 10까지 증가 : "+i);
    }
  }
}
