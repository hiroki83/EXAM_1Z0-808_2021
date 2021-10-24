package bonus2;
public class Question20 {
  public static void main(String[] args) {
    print((a,b) -> a + " " + b);
    //print((String a,b) -> a + " " + b);
  }
  private static void print(Secret s) {
    String name = "Hiroki";
    String surname = "Inoue";
    System.out.println(s.test(name, surname));
  }
}
