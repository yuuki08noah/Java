package Chapter7;

public class Ex7_7 {
  public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.sprayWater();
    car = fe;
    car.drive();
    fe2 = (FireEngine)car; // 강제 형변환
    fe2.sprayWater();
  }
}

class Car {
  String color;
  int cnt_door;

  void drive() {
    System.out.println("VROOM VROOM VROOM VROOM VROOM VROOM");
  }

  void stop() {
    System.out.println("STOP");
  }
}

class FireEngine extends Car {
  void sprayWater() {
    System.out.println("SPRAY WATER");
  }
}