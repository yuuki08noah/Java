package part03_collection.ch03;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
  public static void main(String[] args) {
    Map<String, Integer> javaScore = new HashMap<>();

    // 추가
    javaScore.put("Java", 10);
    javaScore.put("Python", 20);
    javaScore.put("JavaScript", 30);
    javaScore.put("PHP", 40);
    javaScore.put("C#", 50);
    javaScore.put("C++", 60);
    javaScore.put("Kotlin", 70);

    // 탐색
    System.out.println(javaScore.get("Java"));

    // 삭제
    javaScore.remove("Java");

    // 크기
    System.out.println(javaScore.size());
  }
}
