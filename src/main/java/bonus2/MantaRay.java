package bonus2;
interface CanSwim {
  public static int SPEED = 15;
  public void swim();
}
public class MantaRay implements CanSwim {
  public void swim() {
    System.out.println("MantaRay is swimming: " + SPEED);
  }
}
