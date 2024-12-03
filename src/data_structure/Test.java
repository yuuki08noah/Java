package data_structure;

public class Test {
  public static void main(String[] args) {
    List<Integer> linkedList = new LinkedList<>();
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.printAll();

    linkedList.remove(2);
    linkedList.printAll();

    linkedList.insert(0, 50);
    linkedList.insert(1, 70);
    linkedList.printAll();
    linkedList.printReversed();
  }
}
