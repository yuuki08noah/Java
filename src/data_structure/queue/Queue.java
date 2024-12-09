package data_structure.queue;

import data_structure.linked_list.Node;

public interface Queue<T> {
  void enqueue(T t);
  Node<T> dequeue();
  Node<T> peek();
  Boolean isEmpty();
  Boolean isFull();
  Long size();
  void printAll();
  void clear();
}
