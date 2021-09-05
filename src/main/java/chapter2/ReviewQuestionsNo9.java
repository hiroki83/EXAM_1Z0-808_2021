package chapter2;
public class ReviewQuestionsNo9 {
  public static void main(String[] args) {
    for (int i=0; i<10;) {
      i++;
      System.out.println("Hello World");
    }
    int i = 0;
    int j = 0;
    int x = i++ + j++;
    System.out.println("x="+x+", i="+i+", j="+j);
  }
}
