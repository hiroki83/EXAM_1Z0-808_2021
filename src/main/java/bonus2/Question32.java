package bonus2;
public class Question32 {
  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("meow");
    StringBuilder s2 = new StringBuilder("meow");
    if (s1 == s2) System.out.println("one");
    if (s1.equals(s2)) System.out.println("two");
    //if (s1 == "meow") System.out.println("three");//DOES NOT COMPILE
    if (s1.toString() == "meow") System.out.println("four");
  }
}
