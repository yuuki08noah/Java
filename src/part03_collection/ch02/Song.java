package part03_collection.ch02;

public class Song implements Comparable<Song> {
  private String title;
  private String artist;
  private String time;
  private String bpm;

  public Song(String title, String artist, String time, String bpm) {
    this.title = title;
    this.artist = artist;
    this.time = time;
    this.bpm = bpm;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getTime() {
    return time;
  }

  public String getBpm() {
    return bpm;
  }

  @Override
  public String toString() {
    return "Song : " + title;
  }

  @Override
  public int compareTo(Song o) {
    return -o.title.compareTo(title);
  }
}
