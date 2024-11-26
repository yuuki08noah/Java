package part02_generic_interface.ch01;

public class Printer3DPowder {
  private Powder material;

  public Powder getMaterial() {
    return material;
  }

  public void setMaterial(Powder material) {
    this.material = material;
  }

  public void showInfo() {
    System.out.println("재료 " + material);
  }
}
