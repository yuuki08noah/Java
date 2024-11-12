package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8_07 {
  public static void main(String[] args) {
    int answer = (int)(Math.random()*100)+1;
    Scanner sc = new Scanner(System.in);
    int input;
    int count = 0;

    do {
      count++;
      System.out.println("1과 100사이의 값을 입력하세요 : ");
      try { // 예외가 발생할 가능성이 있는 문장은 try 를 통하여 감쌈.
        input = sc.nextInt();
      } catch (Exception e) { // try 에서 예외 발생 시 실행, 아니라면 무시
        System.out.println("유효하지 않은 값입니다.");
        continue;
      }
      if (answer > input) {
        System.out.println("더 큰 수를 입력하세요");
      } else if(answer < input) {
        System.out.println("더 작은 수를 입력하세요");
      } else {
        System.out.println("맞추셨습니다! 시도 횟수 : " + count);
        break;
      }
    } while(true);
  }
}
