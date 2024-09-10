package Chapter6;

public class Ex6_2 {
  public static void main(String[] args) {
    System.out.println("카드의 가로, 세로는 : " + Card.width + ", " + Card.height + "입니다.");
    Card.width = 150;
    Card.height = 200;
    System.out.println("카드의 가로, 세로는 : " + Card.width + ", " + Card.height + "입니다.");

    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 7;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 6;

    System.out.println("c1: " + c1.kind + " " + c1.number + "입니다.");
    System.out.println("c2: " + c2.kind + " " + c2.number + "입니다.");
  }
}

class Card {
  // 필드
  String kind;
  int number;
  static int width = 100;
  static int height = 250;
  // 메서드
}