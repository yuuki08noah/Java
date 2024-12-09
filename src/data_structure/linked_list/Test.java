package data_structure.linked_list;

public class Test {
  public static void main(String[] args) {
    List<Integer> linkedList = new LinkedList<>();
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.printAll();

    linkedList.remove(2L);
    linkedList.printAll();

    linkedList.insert(0L, 50);
    linkedList.insert(1L, 70);
    linkedList.printAll();
    linkedList.printReversed();
  }
}
