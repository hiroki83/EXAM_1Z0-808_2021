package bonus2;
public class ParkRanger {
  public void noteNewOffspring(Mammal mammal) {
    mammal.numberOfOffspring++;
  }
  public static void main(String[] args) {
    //new ParkRanger().noteNewOffspring(new Antelope());
    //new ParkRanger().noteNewOffspring((Mammal) new String());//DOES NOT COMPILE
    new ParkRanger().noteNewOffspring((Mammal) new Object());
  }
}
