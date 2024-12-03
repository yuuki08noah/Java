package data_structure;

public interface List<T> {
  Node add(T element);
  Node remove(Integer index);
  Node insert(Integer index, T element);
  Node get(Integer index);
  void printAll();
  void printReversed();
  void removeAll();
  Integer getSize();
  Boolean isEmpty();
}
