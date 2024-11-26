package part02_generic_interface.ch01;

public class Printer3DObject {
  private Object material;

  public Object getMaterial() {
    return material;
  }

  public void setMaterial(Object material) {
    this.material = material;
  }

  public void showInfo() {
    System.out.println("재료 " + material);
  }
}
