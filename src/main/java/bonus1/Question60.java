package bonus1;
import java.util.function.*;
public class Question60 {
  public static void main(String[] args) {
    String str = null;
    //String str = "Test";
    check(s -> s == null || s.isEmpty(), str);
  }
  public static void check(Predicate<String> checker, String str) {
     if(checker.test(str))
       System.out.println("is empty");
     else
       System.out.println("is not empty");
  }
}
