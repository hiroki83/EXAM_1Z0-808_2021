package chapter5;
public interface Walk {
  public default int getSpeed() {
    return 5;
  }
}
