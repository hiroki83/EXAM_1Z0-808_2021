package chapter4;
public class OrderOfInitialization {
  private String name = "Torchie";
  { System.out.println(name);}
  //private static int COUNT = 0;
  private static int COUNT;
  static { System.out.println(COUNT);}
  static { COUNT += 10; System.out.println(COUNT);}
  public OrderOfInitialization() {
    System.out.println("constructor");
  }
  public static void main(String[] args) {
    OrderOfInitialization init = new OrderOfInitialization();
  }
}
