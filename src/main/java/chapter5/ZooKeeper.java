package chapter5;
public class ZooKeeper {
  public static void main(String[] args) {
    Animal animal = new Gorilla();
    System.out.println(animal.getName());
    Gorilla gorilla = new Gorilla();
    System.out.println(gorilla.getName());
  }
}
