package Chapter7;

public class Ex7_1 {
  public static void main(String[] args) {
    SmartTv stv = new SmartTv();

    stv.turnOn();
    stv.channel = 10;
    stv.upChannel();
    stv.displayCaption("Hello, World!");
    stv.caption = true;
    stv.displayCaption("한국어");
    System.out.println(stv.channel);
  }
}

class Tv {
  // fields
  boolean power;
  int channel;

  // methods
  void turnOn() { power = !power; }
  void upChannel() { channel++; }
  void downChannel() { channel--; }
}

class SmartTv extends Tv {
  // fields
  boolean caption; // status of subtitle "ON" / "OFF"

  // methods
  void displayCaption(String subtitle) {if (caption) System.out.println(subtitle); }
}