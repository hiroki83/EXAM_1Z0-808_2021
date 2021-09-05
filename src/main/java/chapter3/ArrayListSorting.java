package chapter3;
import java.util.*;
public class ArrayListSorting {
  public static void main(String[] args) {
    List<String> numbers = new ArrayList<>();
    numbers.add("10");
    numbers.add("9");
    numbers.add("100");
    Collections.sort(numbers);
    System.out.println(numbers);
  }
}
