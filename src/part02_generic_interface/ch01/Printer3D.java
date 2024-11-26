package part02_generic_interface.ch01;

public class Printer3D<T> {
  private T material;

  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }
}
