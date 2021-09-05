package chapter5;
public interface Run {
  //public default double getSpeed() {//DOES NOT COMPILE
  //public default Integer getSpeed() {//DOES NOT COMPILE
  public default int getSpeed() {
    return 10;
  }
}
