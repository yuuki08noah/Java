package Chapter6;

public class Ex6_12 {
  public static void main(String[] args) {
    Car c1 = new Car();

    Car c2 = new Car("Red", "Auto", 2);

    Car c3 = new Car("Blue");

    System.out.println("c1 color = " + c1.color + " / gear = " + c1.gearType + " / door = " + c1.doorCount);
    System.out.println("c2 color = " + c2.color + " / gear = " + c2.gearType + " / door = " + c2.doorCount);
    System.out.println("c3 color = " + c3.color + " / gear = " + c3.gearType + " / door = " + c3.doorCount);
  }
}
class Car {
  // 속성(색상, 변속기 종류, 문의 개수)
  String color;
  String gearType;
  int doorCount;
  
  // 기본 생성자
  Car() {
    this("White", "Auto", 4); // 자신이 아닌 다른 생성자를 호출하는 코드
  }
  Car(String color) {
    this(color, "Auto", 4);
  }
  // 사용자 정의 생성사
  Car(String color, String gearType, int doorCount) {
    this.color = color;
    this.gearType = gearType;
    this.doorCount = doorCount;
  }
}
