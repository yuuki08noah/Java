package part01_thread.ch05;

public class Bathroom {
  public static void main(String[] args) {
    Poopman K = new Poopman("K");
    Poopman L = new Poopman("L");
    Poopman M = new Poopman("M");
    Poopman O = new Poopman("O");
    Poopman P = new Poopman("P");
    Poopman A = new Poopman("A");
    Poopman B = new Poopman("B");
    Poopman C = new Poopman("C");
    Poopman D = new Poopman("D");
    Poopman F = new Poopman("F");
    Poopman E = new Poopman("E");

    K.start();
    L.start();
    M.start();
    O.start();
    P.start();
    A.start();
    B.start();
    C.start();
    D.start();
    F.start();
    E.start();
  }
}
