package Chapter6;

public class Ex6_10 {
  public static void main(String[] args) {
    MyMath3 mm = new MyMath3();
    System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
    System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
    System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
    System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));
  }
}
class MyMath3 {
  int add(int a, int b) {
    return a + b;
  }
  long add(long a, int b) {
    return a + b;
  }
  long add(int a, long b) {
    return a + b;
  }
  // Error: 메서드 오버로딩은 매개변수에 따라서 할 수 있다.
//  int add(long a, int b) {
//    return a + b;
//  }
  long add(long a, long b) {
    return a + b;
  }
}