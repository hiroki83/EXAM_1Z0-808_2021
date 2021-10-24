package bonus3;
import java.util.*;
public class Question14 {
  public static void main(String[] args) {
    //List numberList = Arrays.asList(5, 10, -5, -10, 3, "3a", "b3");
    List numberList = Arrays.asList("5", "10", "-5", "-10", "3", "3a", "b3");
    Collections.sort(numberList);
    System.out.println(numberList);
    String[] stringArray = {"5", "10", "-5", "-10", "3", "3a", "b3"};
    //Collections.sort(stringArray);//DOES NOT COMPILE
    Arrays.sort(stringArray);
    System.out.println(stringArray);
  }
}
