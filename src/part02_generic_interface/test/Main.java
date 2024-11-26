package part02_generic_interface.test;

public class Main {
  public static void main(String[] args) {
    Generic<String> generic = new Generic<>();
    generic.setValue("HELLO");
    System.out.println(generic.getValue());
  }
}
