package chapter3;
import java.util.Arrays;
public class ArraysSorting {
  public static void main(String[] args) {
    String[] strings = {"10", "9", "100", "a", "A"};
    Arrays.sort(strings);
    for (String string : strings)
      System.out.print(string + " ");
    int [] numbers = { 10, 9, 100};
    Arrays.sort(numbers);
    for(int i = 0; i < numbers.length; i++)
      System.out.print(numbers[i] + " ");
    System.out.print(numbers + " ");
  }
}
