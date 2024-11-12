package Chapter7;

public class Ex7_06 {
  public static void main(String[] args) {
    Outer.Inner i = new Outer.Inner();
    System.out.println(i.getIv());
  }
}

class Outer {
  static class Inner {
    private int iv = 100;

    public int getIv() {
      return iv;
    }
  }
}
