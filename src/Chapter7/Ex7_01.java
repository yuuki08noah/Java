package Chapter7;

public class Ex7_01 {
  public static void main(String[] args) {
    SutdaDeck deck = new SutdaDeck();

    for(int i = 0; i < deck.CARD_NUM; i++) {
      System.out.print(deck.cards[i].toString()+", ");
    }
    System.out.println();
    deck.shuffle();
    for(int i = 0; i < deck.CARD_NUM; i++) {
      System.out.print(deck.cards[i].toString()+", ");
    }
    System.out.println();
    System.out.println(deck.pick());
    System.out.println(deck.pick(2));
  }
}

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}

class SutdaDeck {
  final int CARD_NUM = 20;

  SutdaCard[] cards = new SutdaCard[CARD_NUM];
  SutdaDeck() {
    for (int i = 0; i < CARD_NUM; i++) {
      int num = i % 10 + 1;
      boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
      cards[i] = new SutdaCard(i, isKwang);
    }
  }

  public void shuffle() {
    for (int i = 0; i < 20; i++) {
      int index_1 = (int)(Math.random()*20);
      int index_2 = (int)(Math.random()*20);
      SutdaCard temp = cards[index_1];
      cards[index_1] = cards[index_2];
      cards[index_2] = temp;
    }
  }

  public SutdaCard pick(int index) {
    if (index < 0 || index >= CARD_NUM) return null;
    return cards[index-1];
  }
  public SutdaCard pick() {
    return cards[(int)(Math.random()*20)];
  }
}