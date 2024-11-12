package part01_thread.ch02;

import java.util.Random;

public class User extends Thread {
  private String character;
  private int kills;

  public User(String character) {
    this.character = character;
  }

  @Override
  public void run() {
    Random random = new Random();
    this.kills = random.nextInt(5) + 1;
  }

  public int getKills() {
    return kills;
  }

  public String getCharacter() {
    return character;
  }
}
