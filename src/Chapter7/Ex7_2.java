package Chapter7;

public class Ex7_2 {
  public static void main(String[] args) {
    Parent child = new Child();
    System.out.println(child.x);
  }
}
class Parent {
  int x = 10;
}

class Child extends Parent {
  int x = 20;
  void method() {
    System.out.println(x);
    System.out.println(super.x);
  }
}