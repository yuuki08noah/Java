package data_structure.queue;

import data_structure.linked_list.LinkedList;
import data_structure.linked_list.Node;

public class QueueList<T> extends LinkedList<T> implements Queue<T> {
  private Long queue_size;

  public QueueList(Long size) {
    this.queue_size = size;
  }
  @Override
  public void enqueue(T t) {
    if(isFull()) return;
    add(t);
  }

  @Override
  public Node<T> dequeue() {
    if(isEmpty()) return null;
    Node<T> temp = get(0L);
    remove(0L);
    return temp;
  }

  @Override
  public Node<T> peek() {
    if(isEmpty()) return null;
    return get(0L);
  }

  @Override
  public Boolean isFull() {
    return getSize() == queue_size;
  }

  public Boolean isEmpty() {
    return getSize() == 0;
  }

  @Override
  public Long size() {
    return queue_size;
  }

  @Override
  public void clear() {
    removeAll();
  }
}
