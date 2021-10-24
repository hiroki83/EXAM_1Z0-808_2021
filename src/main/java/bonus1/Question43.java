package bonus1;
public class Question43 {
  public static void main(String[] args) {
    int x = 10 % 2;
    int y = 3 / 5 + ++x;
    //int z += 4 * x;
    int z = 0;
    z += 4 * x;
    System.out.println(x + "," + y + "," + z);
  }
}
