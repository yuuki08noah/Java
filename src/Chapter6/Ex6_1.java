package Chapter6;

public class Ex6_1 {
  public static void main(String[] args) {
    Tv[] tv = new Tv[3]; // Chapter6.Tv 배열 생성

    // Chapter6.Tv 배열 초기화 및 채널 변수(필드) 초기화
    for(int i = 0; i < tv.length; i++) {
      tv[i] = new Tv();
      tv[i].channel = i;
    }

    for(int i = 0; i < tv.length; i++) {
      System.out.println("TV " + i + ' ' + (tv[i].channel) + "번");
    }
  }
}
class Tv {
  // Chapter6.Tv 속성(필드)
  String color; // 초기값 : Null, 참조변수 : 주소를 저장
  boolean power; // 참조변수
  int channel; // 초기값 : 0, 기본변수

  // Chapter6.Tv 기능(메서드)
  void turnOn() {
    power = !power;
  }
  void upChannel() {
    channel++;
  }
  void downChannel() {
    channel--;
  }
  void setChannel(int channel) {
    this.channel = channel;
  }
  void setColor(String color) {
    this.color = color;
  }
}