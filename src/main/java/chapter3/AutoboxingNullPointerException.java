package chapter3;
import java.util.*;
public class AutoboxingNullPointerException {
  public static void main(String[] args) {
    List<Integer> heights = new ArrayList<>();
    heights.add(null);
    int h = heights.get(0);//autoboxing with null
  }
}
