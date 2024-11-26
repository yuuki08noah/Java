package part03_collection.ch04;

import java.util.ArrayList;
import java.util.List;

public class GenericTest extends Animal {
  public static void main(String[] args) {
    new GenericTest().test();
  }

  public void test() {
    // 1. Animal 배열 선언하고 Dog, Cat, Pig 객체로 초기화
    Animal[] animals = {new Dog(), new Cat(), new Pig()};
    takeAnimals(animals);

    List<Animal> animals1 = new ArrayList<>();
    animals1.add(new Dog());
    animals1.add(new Cat());
    animals1.add(new Pig());
    takeAnimals(animals1);

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog());
  }

  public void takeAnimals(Animal[] animals) {
    for (Animal animal : animals) {
      animal.eat();
    }
  }
  public void takeAnimals(List<? extends Animal> animals) {
    for (Animal animal : animals) {
      animal.eat();
    }
  }
}

abstract class Animal {
  public void howl() { System.out.println("ANIMAL HOWLS"); }
  public void role() { System.out.println("ANIMAL'S ROLE"); }
  public void eat() { System.out.println("ANIMAL EATS"); }
}

class Dog extends Animal {}
class Cat extends Animal {}
class Pig extends Animal {}