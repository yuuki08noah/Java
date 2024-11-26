package part02_generic_interface.ch03;

public class Test {
  public static void main(String[] args) {
    Printer<Material> printer = new Printer();
    Plastic plastic = new Plastic();
    printer.setMaterial(plastic);
  }
}
