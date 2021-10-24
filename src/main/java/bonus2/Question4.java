package bonus2;
public class Question4 {
  private int i = 6;
  private int j = i;
  public Question4() {
    i = 5;
  }
  public static void main(String[] args) {
    Question4 a = new Question4();
    System.out.println(a.i + a.j);
  }
}
