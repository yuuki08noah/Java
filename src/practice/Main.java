package practice;

import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List array = new LinkedList<Integer>();
    array.add(1);
    array.add(2);
    array.addAll(array);
    array.remove(1);
    System.out.println(array);
  }
}