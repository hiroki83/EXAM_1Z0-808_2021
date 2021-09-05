package chapter4;
public class Test {
  public static void main(String[] args) {
    Test test = new Test();
    test.throwException();
  }
  public String throwException() {
    throw new RuntimeException();
  }
}
