package chapter3;
import java.util.*;
public class AutoboxingAndMethodParameter {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.remove(1);
    System.out.println(numbers);
    List<Integer> numbers2 = new ArrayList<>();
    numbers2.add(1);
    numbers2.add(2);
    numbers2.remove(new Integer(1));
    System.out.println(numbers2);
    List<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1);
    numbers3.add(2);
    numbers3.remove(new Integer(2));
    System.out.println(numbers3);
  }
}
