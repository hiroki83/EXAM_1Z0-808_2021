public class Deer {
  public Deer() {//constructor
    System.out.println("Deer");
  }
  public Deer(int age) {//constructor
    System.out.println("DeerAge");
  }
  private boolean hasHorns() {
    return false;
  }
  public static void main(String[] args) {
    Deer deer = new Reindeer(5);
    System.out.println(","+deer.hasHorns());
  }
}
class Reindeer extends Deer {
  public Reindeer(int age) { 
    System.out.println("Reindeer");
  }
  public boolean hasHorns() {
    return true;
  }
}
