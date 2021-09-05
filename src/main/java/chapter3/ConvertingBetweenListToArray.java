package chapter3;
import java.util.*;
public class ConvertingBetweenListToArray {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("hawk");
    list.add("robin");
    Object[] objectArray = list.toArray();
    System.out.println(objectArray.length);
    String[] stringArray = list.toArray(new String[0]);
    System.out.println(objectArray.length);
  }
}
