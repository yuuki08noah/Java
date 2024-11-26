package part02_generic_interface.ch01;

public class Printer3DPlastic {
  private Plastic material;

  public Plastic getMaterial() {
    return material;
  }

  public void setMaterial(Plastic material) {
    this.material = material;
  }

  public void showInfo() {
    System.out.println("재료 " + material);
  }
}
