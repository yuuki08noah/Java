package part01_thread.ch01;

public class ThreadTest {
  public static void main(String[] args) {
    ThreadDesc desc = new ThreadDesc();
    Thread t = new Thread(new ThreadAsc());
    t.start();
    desc.start();
  }
}