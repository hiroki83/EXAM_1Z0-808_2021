package chapter3;
import java.util.Arrays;
public class ArraysSearching {
  public static void main(String args []) {
    int[] numbers = {2,4,6,8};
    System.out.println(Arrays.binarySearch(numbers, 2));
    System.out.println(Arrays.binarySearch(numbers, 4));
    System.out.println(Arrays.binarySearch(numbers, 1));
    System.out.println(Arrays.binarySearch(numbers, 3));
    System.out.println(Arrays.binarySearch(numbers, 5));
    System.out.println(Arrays.binarySearch(numbers, 7));
    System.out.println(Arrays.binarySearch(numbers, 9));
  }
}
