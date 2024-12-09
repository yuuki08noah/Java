package data_structure.linked_list;

public class Node<T> {
  T data;
  Node<T> next;
  Node<T> prev;

  public Node(T data) {
    this.data = data;
  }

  public Node() {}

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  @Override
  public String toString() {
    return data.toString();
  }
}
