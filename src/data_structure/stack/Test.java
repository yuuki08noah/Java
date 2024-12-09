package data_structure.stack;

public class Test {
  public static void main(String[] args) {
    Stack<Integer> stack = new StackList(30L);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.printAll();
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());
    stack.clear();
    System.out.println(stack.isEmpty());
  }
}
