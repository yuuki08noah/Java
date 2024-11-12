package Chapter8;

public class Ex8_5 {
  public static void main(String[] args) {
    try {
      System.out.println(4 / 0);
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
    System.out.println("아잉아잉ㅇ아잉이자살하고싶다왜살지진짜죽고싶네");
  }
}
