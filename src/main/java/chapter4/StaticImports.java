import java.util.List;
import java.util.Arrays;
import static java.util.Arrays.asList;
public class StaticImports {
  public static void main(String[] args) {
    List<String> list1 = asList("one", "two");
    List<String> list2 = Arrays.asList("one", "two");
  }
}
