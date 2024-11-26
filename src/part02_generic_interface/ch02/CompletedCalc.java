package part02_generic_interface.ch02;

public class CompletedCalc extends Calculator {
  @Override
  public int mul(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int div(int num1, int num2) {
    return num1 / num2;
  }
}
