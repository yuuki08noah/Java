package data_structure.queue;

import data_structure.linked_list.LinkedList;

public class Test {
  public static void main(String[] args) {
    Queue<Long> queue = new QueueList<>(30L);

    queue.enqueue(30L);
    queue.enqueue(20L);
    queue.enqueue(30L);
    queue.enqueue(40L);
    System.out.println(queue.dequeue());
    System.out.println(queue.peek());
    queue.printAll();
  }
}
