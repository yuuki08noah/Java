package data_structure.stack;

import data_structure.linked_list.LinkedList;
import data_structure.linked_list.Node;

public class StackList<T> extends LinkedList<T> implements Stack<T> {
  Long stack_size;

  public StackList(Long size) {
    this.stack_size = size;
  }

  @Override
  public void push(T data) {
    if(isFull()) return;
    add(data);
  }

  @Override
  public Node<T> pop() {
    if(isEmpty()) return null;
    Node<T> temp = get(getSize()-1);
    remove(getSize()-1);
    return temp;
  }

  @Override
  public Node<T> peek() {
    if(isEmpty()) return null;
    return get(getSize()-1);
  }

  @Override
  public Boolean isEmpty() {
    return getSize() == 0;
  }

  @Override
  public Boolean isFull() {
    return getSize() == stack_size;
  }

  @Override
  public Long size() {
    return getSize();
  }

  @Override
  public void clear() {
    removeAll();
  }
}
