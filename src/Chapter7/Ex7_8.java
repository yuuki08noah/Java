package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex7_8 {
  public static void main(String[] args) {
    Buyer b = new Buyer(1000, 0);

    b.buy(new Television());
    b.buy(new Computer());
    b.buy(new Audio());

    b.summary();
  }
}

class Buyer {
  int money;
  int reward;
  int i = 0;
  // 제품들을 담을 카트 변수
  Product[] products = new Product[100];

  // 생성자(필드를 초기화)
  Buyer(int money, int reward) {
    this.money = money;
    this.reward = reward;
  }

  // 구매 메서드
  void buy(Product product) {
    // if : current money < product.price -> return
    // else : current money -= product.price and reward += product.price * ratio

    if(this.money < product.price) {
      System.out.println("You don't have enough money to buy this product");
    } else {
      this.money -= product.price;
      this.reward += product.reward;
      products[this.i++] = product;
      System.out.println("You bought " + product);
    }
  }

  // 구매 현황 메서드
  void summary() {
    // print spent money in sum
    // read the cart list and print that
    int sum = 0;
    String items = "";
    for(Product product : products) {
      if(product == null) break;
      sum += product.price;
      items += product.toString() + ", ";
    }
    System.out.println(items);
    System.out.println("Sum of items you bought : " + sum);
  }
}

abstract class Product {
  int price;
  int reward;

  Product(int price) {
    this.price = price;
    this.reward = (int)(price/10D);
  }

  abstract public String toString();
}
class Television extends Product {
  Television() {
    super(100);
  }

  @Override
  public String toString() {
    return "Tv";
  }
}

class Computer extends Product {
  Computer() {
    super(200);
  }
  @Override
  public String toString() {
    return "Computer";
  }
}

class Audio extends Product {
  Audio() {
    super(50);
  }
  @Override
  public String toString() {
    return "Audio";
  }
}