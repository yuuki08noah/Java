package part01_thread.ch05;

public class Poopman extends Thread {
  private String name;
  public Poopman(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    boolean flag = true;
    while (flag) {
      // 빈칸 찾기
      for (int i = 0; i < 4; i++) {
        if (!Rooms.stalls.get(i).isLocked() && Rooms.pooppapers.get(i) >= 20) { // 빈칸을 찾고, 그 칸의 휴지가 20 이상이라면
          // 사용 선언 후 이용하기
          Rooms.stalls.get(i).useStall();
          System.out.println(name + "이 변기를 사용합니다.");
          Rooms.pooppapers.set(i, Rooms.pooppapers.get(i) - 20); // 휴지 이용하기
          System.out.println(name + "이 휴지를 사용합니다.");
          Rooms.stalls.get(i).unUseStall();
          System.out.println(name + "이 화장실을 나옵니다.");
          flag = false;
          break;
        }
      }
      if(flag) {
        System.out.println(name + "이 대기중입니다.\n");
      }
    }
  }
}
