package bonus3;
public class Chicken {
  private void layEggs(int... eggs) {
    System.out.println("varargs");
    System.out.println("many" + eggs[0] + " ");
  }
  private void layEggs(int eggs) {
    System.out.println("int");
    System.out.println("one" + eggs + " ");
  }
  public static void main(String[] args) {
    Chicken c = new Chicken();
    c.layEggs(1,2);
    c.layEggs(3);
    c.layEggs(null);
  }
}
