package chapter4;
import java.util.*;
public class TraditionalSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    //print(animals, new CheckIfHopper());
    print(animals, (a) -> a.canSwim());
  }
  private static void print(List<Animal> animals, CheckTrait checker) {
  //private static void print(List<Animal> animals, CheckIfHopper checker) {
    for (Animal animal : animals) {
      if(checker.test(animal))
        System.out.print(animal + " ");
    }
    System.out.println();
  }
}
