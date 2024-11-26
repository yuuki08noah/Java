package part03_collection.ch02;

import java.io.*;
import java.util.*;

public class Jukebox {
  private List<Song> songList;

  public Jukebox() {
    songList = new ArrayList<>();
  }

  class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
      return o1.getArtist().compareTo(o2.getArtist());
    }
  }
  class BPMCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
      return -Long.valueOf(o1.getBpm()).compareTo(Long.valueOf(o2.getBpm()));
    }
  }
  public void go() {
    getSong();
//    Collections.sort(songList);
    Collections.sort(songList, new BPMCompare());
    songList.stream().forEach(System.out::println);
  }

  public void getSong() {
    try {
      File file = new File("src/part03_collection/ch02/SongList.txt");
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
    songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
  }

  public static void main(String[] args) {
    new Jukebox().go();
  }
}
