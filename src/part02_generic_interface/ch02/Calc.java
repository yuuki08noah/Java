package part02_generic_interface.ch02;

public interface Calc {
  int add(int num1, int num2);
  int sub(int num1, int num2);
  int mul(int num1, int num2);
  int div(int num1, int num2);

  double PI = 3.14;
  String NAME = "Calculator";
}
