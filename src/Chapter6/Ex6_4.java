package Chapter6;

public class Ex6_4 {
  public static void main(String[] args) {
    MyMath myMath = new MyMath();
    long result1 = myMath.sum(10, 20);
    long result2 = myMath.sub(30, 10);
    long result3 = myMath.mul(40, 5);
    double result4 = myMath.div(60, 10);
    int result5 = myMath.power(2, 3);
    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);
    System.out.println("result4: " + result4);
    System.out.println("result5: " + result5);
  }
}
class MyMath {
  long sum(long a, long b) {
    return a + b;
  }
  long sub(long a, long b) {
    return a - b;
  }
  long mul(long a, long b) {
    return a * b;
  }
  double div(long a, long b) {
    if(b == 0) {
      throw new ArithmeticException("0으로는 나눌 수 없습니다!");
    }
    return (double)a / b;
  }
  int power(int a, int b) {
    int result = 1;
    for(int i = 0; i < b; i++) {
      result *= a;
    }
    return result;
  }
}