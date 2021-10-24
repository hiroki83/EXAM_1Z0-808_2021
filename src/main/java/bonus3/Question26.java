package bonus3;
public class Question26 {
  public static void main(String[] args) {
    String s = "Hiroki Inoue";
    //s.size();//DOES NOT COMPILE
    s.length();
    StringBuilder sb = new StringBuilder("Hiroki Inoue");
    //sb.size();//DOES NOT COMPILE
    sb.length();
  }
}
