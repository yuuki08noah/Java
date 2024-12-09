package data_structure.linked_list;

public interface List<T> {
  Node add(T element);
  Node remove(Long index);
  Node insert(Long index, T element);
  Node get(Long index);
  void printAll();
  void printReversed();
  void removeAll();
  Long getSize();
  Boolean isEmpty();
}
