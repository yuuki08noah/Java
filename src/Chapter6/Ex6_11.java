package Chapter6;

public class Ex6_11 {
  public static void main(String[] args) {
    Data_1 d1 = new Data_1();
    Data_2 d2 = new Data_2(23);

    System.out.println(d2.value);
  }
}
class Data_1 {
  int value;
  // 컴파일러는 아래와 같이 사용자가 생성자를 정의하지 않았다면 자동으로 추가합니다.
  // 기본 생성자라고 부르며, 이름은 클래스이름과 동일하고 반환타입이 없습니다.
  Data_1() {

  }
}
class Data_2 {
  int value;
  // 생성자는 기본 생성자가 아니면 굳이 귀찮게 추가할 필요가 없습니다.
  // 다만, 생성자에서 필드 초기화를 진행한다면 생성자를 추가할 필요가 있습니다.
  Data_2(int x) {
    value = x;
  }
  Data_2() {
    // 기본 생성자를 추가할 수도 있습니다.
  }
}
