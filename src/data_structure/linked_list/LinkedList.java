package data_structure.linked_list;

public class LinkedList<T> implements List<T> {
  private Node<T> head;
  private Long size = 0L;

  @Override
  public Node<T> add(T element) {
    size++;
    if (head == null) {
      head = new Node(element);
      head.next = head;
      head.prev = head;
    }
    else {
      Node<T> node = new Node(element);
      node.prev = head;
      node.next = head.next;
      head.next = node;
      head = node;
    }

    return head;
  }

  @Override
  public Node<T> remove(Long index) {
    if(index >= size || index < 0) {
      return null;
    }

    Node<T> node = head.next;
    for(Integer i = 0; i < index; i++) node = node.next;
    node.prev.next = node.next;
    if(node.next.prev != head) {
      node.next.prev = node.prev;
    }
    if(node == head) {
      head = head.prev;
    }
    node = null;
    size--;
    return node;
  }

  @Override
  public Node<T> insert(Long index, T element) {
    if(index >= size) {
      return null;
    }

    Node<T> node = head.next;
    Node<T> newNode = new Node(element);
    if(index == 0) {
      if(head == null) {
        head = newNode;
        head.next = head;
        head.prev = head;
      } else {
        newNode.next = head.next;
        newNode.prev = head;
        newNode.next.prev = newNode;
        head.next = newNode;
      }
    }
    else if(index == size - 1) {
      newNode.prev = head;
      newNode.next = head.next;
      head = newNode;
    }
    else {
      for (Integer i = 0; i < index - 1; i++) node = node.next;
      newNode.next = node.next;
      newNode.prev = node;
      node.next = newNode;
      newNode.next.prev = newNode;
    }
    size++;
    return newNode;
  }

  @Override
  public Node<T> get(Long index) {
    if(index >= size || index < 0) {
      return null;
    }
    Node<T> node = head.next;
    for(Integer i = 0; i < index; i++) node = node.next;
    return node;
  }

  @Override
  public void printAll() {
    if(head == null) {
      System.out.println("List is empty");
      return;
    }
    Node<T> node = head.next;
    while(node != head) {
      System.out.print(node + " -> ");
      node = node.next;
    }
    System.out.println(node);
  }

  @Override
  public void printReversed() {
    Node node = head;
    while(node != head.next) {
      System.out.print(node + " -> ");
      node = node.prev;
    }
    System.out.println(node);
  }

  @Override
  public void removeAll() {
    head = null;
    size = 0L;
  }

  @Override
  public Long getSize() {
    return size;
  }

  @Override
  public Boolean isEmpty() {
    return size == 0;
  }
}
