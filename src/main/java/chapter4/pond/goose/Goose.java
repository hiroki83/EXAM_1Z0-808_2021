package chapter4.pond.goose;
import chapter4.pond.shore.Bird;
public class Goose extends Bird {
  public void helpGooseSwim() {
    Goose other = new Goose();
    other.floatInWater();
    System.out.println(other.text);
  }
  public void helpOtherGooseSwim() {
    Bird other = new Goose();
//    other.floatInWater();//DOSE NOT COMPILE
//    System.out.println(other.text);//DOSE NOT COMPILE
  }
}
