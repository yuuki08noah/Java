package part01_thread.luge;

public class LugeTest {
  public static void main(String[] args) {
    String[] users = new String[10];
    for (int i = 0; i < users.length; i++) {
      users[i] = "user" + i;
      LugeThread luge = new LugeThread(users[i]);
      luge.start();
    }
  }
}
