package assessmenttest;
class Chicken {}
interface HenHouse {
  public java.util.List<Chicken> getChickens();
}
class HenHouseConcreate implements HenHouse {
  public java.util.List<Chicken> getChickens() {
    java.util.List<Chicken> chickens = new java.util.ArrayList<>();
    //chickens.add(new Chicken());
    //chickens.add(null);
    return chickens;
  }
}
public class Question14 {
  public static void main (String[] args) {
    int[] test = new int[0];
    for (int j=0; j<test.length; j++)
      System.out.println("Array");
    HenHouse house = new HenHouseConcreate();
    System.out.println(house.getChickens().size());
    Chicken chicken = house.getChickens().get(0);
    for (int i=0; i<house.getChickens().size(); chicken = house.getChickens().get(i++)) {
      System.out.println("Cluck");
    }
  }
}
