package Chapter7;

import java.sql.Array;

public class Ex7_04 {
  public static void main(String[] args) {
    MyTv t = new MyTv();
    t.setChannel(10);
    System.out.println(t.getChannel());
    t.setChannel(20);
    System.out.println(t.getChannel());
    t.gotoPrevChannel();
    System.out.println(t.getChannel());
    t.gotoPrevChannel();
    System.out.println(t.getChannel());
  }
}

class MyTv {
  private boolean isPowerON;
  private int channel;
  private int volume;
  private int prevChannel;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;

  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public boolean getIsPowerON() {
    return isPowerON;
  }

  public void setPowerON(boolean powerON) {
    isPowerON = powerON;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
      return;
    }
    this.prevChannel = this.channel;
    this.channel = channel;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if(volume < MIN_VOLUME || volume > MAX_VOLUME) {
      return;
    }
    this.volume = volume;
  }

  public void gotoPrevChannel() {
    setChannel(prevChannel);
  }
}