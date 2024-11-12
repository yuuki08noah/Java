package part01_thread.ch03;

public class SharedTest {
  public static void main(String[] args) {
    // 1. 스레드 두개 생성(점유하고 있는 자원)
    // 2. 스레드 실행
    // 3. 더이상 진행되지 않는 모습을 확인
    // -> 어떻게 해결할 수 있을까?
    ThreadA t1 = new ThreadA();
    ThreadB t2 = new ThreadB();
    t1.start();
    t2.start();
  }
}

