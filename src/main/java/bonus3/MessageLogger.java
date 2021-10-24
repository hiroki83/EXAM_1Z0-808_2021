package bonus3;
public class MessageLogger {
  public static void log(String s) {
    System.out.print("s");
  }
  public static void log(int i) {
    System.out.print("i");
  }
  public static void log(long l) {
    System.out.print("l");
  }
  public static void log(double d) {
    System.out.print("d");
  }
  public static void main(String[] args) {
    short s = 123;
    log(s);
    log(25.0);
    log("hello");
  }
}
