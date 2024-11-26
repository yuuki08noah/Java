package part02_generic_interface.test;

public class Generic<T extends String> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
