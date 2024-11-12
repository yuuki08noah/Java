package part01_thread.ch04;

import java.util.ArrayList;

public class Table {
  public static ArrayList<Fork> forks = new ArrayList<>();

  static {
    forks.add(new Fork());
    forks.add(new Fork());
    forks.add(new Fork());
    forks.add(new Fork());
  }
}
