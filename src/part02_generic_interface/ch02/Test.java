package part02_generic_interface.ch02;

public class Test {
  public static void main(String[] args) {
    CompletedCalc calculator = new CompletedCalc();
    Calculator calculator1 = new CompletedCalc();
    Calc calculator2 = new CompletedCalc();

    System.out.println(calculator.div(5, 2));
    System.out.println(calculator1.mul(5, 2));
    System.out.println(calculator2.sub(5, 2));
  }
}
