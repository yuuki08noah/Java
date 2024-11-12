package part01_thread.ch02;

public class Polling {
  public static void main(String[] args) {
    User[] dealers = new User[10];
    for (int i = 0; i < 10; i++) {
      dealers[i] = new User("이즈리얼" + i);
      dealers[i].start();
    }
    for(int i = 0; i < 10; i++) {
      while (true) {
        int kills = dealers[i].getKills();
        if (kills != 0) {
          System.out.println(dealers[i].getCharacter() + " : " + kills);
          break;
        }
      }
    }
  }
}
