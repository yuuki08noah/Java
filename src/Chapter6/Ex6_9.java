package Chapter6;

public class Ex6_9 {
  public static void main(String[] args) {
    MyMath2 myMath = new MyMath2();
    myMath.a = 10L;
    myMath.b = 20L;

    // 일반 메서드 : Primitive type
    System.out.println("result1: " + myMath.sum());
    System.out.println("result2: " + myMath.sub());
    System.out.println("result3: " + myMath.mul());
    System.out.println("result4: " + myMath.div());

    long a = 10L;
    long b = 20L;
    // static 메서드
    System.out.println("result5: " + MyMath2.sum(a, b));
    System.out.println("result6: " + MyMath2.sub(a, b));
    System.out.println("result7: " + MyMath2.mul(a, b));
    System.out.println("result8: " + MyMath2.div(a, b));
  }
}
class MyMath2 {
  long a, b;

  static long sum(long a, long b) { return a + b; }
  static long sub(long a, long b) { return a - b; }
  static long mul(long a, long b) { return a * b; }
  static double div(long a, long b) { return (double)a / b; }

  long sum() { return a + b; }
  long sub() { return a - b; }
  long mul() { return a * b; }
  double div() { return (double)a / b; }
}