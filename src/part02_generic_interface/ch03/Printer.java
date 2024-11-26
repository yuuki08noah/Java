package part02_generic_interface.ch03;

public class Printer<T> {
  private T material;

  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  public void showInfo() {
    System.out.println(material);
  }
}
