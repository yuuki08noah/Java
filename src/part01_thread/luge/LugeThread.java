package part01_thread.luge;

public class LugeThread extends Thread {
  private String name;
  public LugeThread(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(name + "가 루지를 출발합니다.");
    System.out.println(name + "가 루지를 도착했습니다.");
  }
}
