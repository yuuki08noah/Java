package part01_thread.ch04;

public class Kitchen {
  public static void main(String[] args) {
    Philosopher Aristotle = new Philosopher("Aristotle", 0);
    Philosopher Socrates = new Philosopher("Socrates", 1);
    Philosopher Plato = new Philosopher("Plato", 2);
    Philosopher Pythagoras = new Philosopher("Pythagoras", 3);

    Aristotle.start();
    Socrates.start();
    Plato.start();
    Pythagoras.start();
  }
}
