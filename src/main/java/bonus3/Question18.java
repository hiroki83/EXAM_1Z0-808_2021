package bonus3;
public class Question18 {
  public static void main(String[] args) {
    int j = 1;
    for (int i = 0; i<4 && j<3; ++i) {
      ++j;
      System.out.println("i = " + i);
      System.out.println("j = " + j);
      System.out.println(i+j);
    }
  }
}
