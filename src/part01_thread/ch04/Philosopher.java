package part01_thread.ch04;

import java.util.Random;

public class Philosopher extends Thread {
  private String name;
  private int location;

  public Philosopher(String name, int location) {
    this.name = name;
    this.location = location;
  }

  public void takeFork(int location) {
    Fork fork = Table.forks.get(location);
    fork.useFork();
    System.out.println(name + " 이 " + location + " 번 포크를 사용합니다.");
  }

  public void putFork(int location) {
    Fork fork = Table.forks.get(location);
    fork.unUseFork();
    System.out.println(name + " 이 " + location + " 번 포트를 내려놓습니다");
  }

  @Override
  public void run() {
    // 1. 랜덤 시간 동안 생각하기
    int randTime = new Random().nextInt(5)*100;
    try {
      System.out.println(name + " : " + randTime + "ms 기다리기");
      Thread.sleep(randTime);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    // 2. 왼쪽의 포크 줍기
    takeFork(location);

    // 3. 오른쪽의 포크 줍기
    takeFork((location + 1)%4);

    // 4. 먹기
    System.out.println("먹기");

    // 5. 포크 내려놓기
    putFork(location);
    putFork((location + 1)%4);
  }
}
