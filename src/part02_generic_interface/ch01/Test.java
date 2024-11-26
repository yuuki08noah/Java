package part02_generic_interface.ch01;

public class Test {
  public static void main(String[] args) {
    // 재료 생성 ( Plastic, Powder )
    Plastic plastic = new Plastic();
    Powder powder = new Powder();

    // 3D Printer 생성
    Printer3DPlastic printer3DPlastic = new Printer3DPlastic();
    Printer3DPowder printer3DPowder = new Printer3DPowder();
    Printer3DObject printer3DObject = new Printer3DObject();

    printer3DPlastic.setMaterial(plastic);
    printer3DPowder.setMaterial(powder);
    printer3DObject.setMaterial(powder);

    // 출력
    printer3DPlastic.showInfo();
    printer3DPowder.showInfo();
    printer3DObject.showInfo();

    Powder p1 = (Powder)printer3DObject.getMaterial();
    System.out.println(p1);

    // 제네릭 사용
    Printer3D<Powder> printer3D = new Printer3D<>();
    printer3D.setMaterial(powder);
    Powder p2 = printer3D.getMaterial();
    System.out.println(p2);
  }
}
