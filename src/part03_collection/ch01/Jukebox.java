package part03_collection.ch01;

import java.io.*;
import java.util.*;

public class Jukebox {
  private List<String> songList;
  private Set<String> songSet;

  public Jukebox() {
    songList = new ArrayList<>();
    songSet = new HashSet<>(); // 정렬
  }

  public void go() {
    getSong();
    System.out.println(songList);
    System.out.println(songSet);
  }

  public void getSong() {
    try {
      File file = new File("src/part03_collection/ch01/SongList.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while((line = reader.readLine()) != null) {
        addSong(line);
      }
    } catch (Exception e) {
      System.out.println(e.getStackTrace());
    }
  }

  public void addSong(String lineToParse) {
    String[] tokens = lineToParse.split("/");
    songList.add(tokens[0]);
    songSet.add(tokens[0]);
    Collections.sort(songList);
  }

  public static void main(String[] args) {
    new Jukebox().go();
  }
}
