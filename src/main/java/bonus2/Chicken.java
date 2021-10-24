package bonus2;
public class Chicken {
  private void layEggs(int... eggs) {
    System.out.println("many " + eggs[0] + "  ");
  }
  private void layEggs(int egg) {
    System.out.println("one " + egg + "  ");
  }
  public static void main(String[] args) {
    Chicken chicken = new Chicken();
    chicken.layEggs(1,2);
    chicken.layEggs(3);
    chicken.layEggs(new Integer(2));
  }
}
