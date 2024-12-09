package data_structure.stack;

import data_structure.linked_list.Node;

public interface Stack<T> {
  void push(T data);
  Node<T> pop();
  Node<T> peek();
  Boolean isEmpty();
  Boolean isFull();
  Long size();
  void printAll();
  void clear();
}
