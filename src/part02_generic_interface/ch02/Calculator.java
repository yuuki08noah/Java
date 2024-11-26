package part02_generic_interface.ch02;

public abstract class Calculator implements Calc {
  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int sub(int num1, int num2) {
    return num1 + num2;
  }
}
