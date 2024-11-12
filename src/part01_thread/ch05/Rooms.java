package part01_thread.ch05;

import java.util.ArrayList;

public class Rooms {
  public static ArrayList<Stall> stalls = new ArrayList<>();
  public static ArrayList<Integer> pooppapers = new ArrayList<>();

  static {
    stalls.add(new Stall());
    stalls.add(new Stall());
    stalls.add(new Stall());
    stalls.add(new Stall());
    pooppapers.add(100);
    pooppapers.add(100);
    pooppapers.add(100);
    pooppapers.add(100);
  }
}
