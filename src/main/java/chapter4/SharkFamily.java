package chapter4;
public interface SharkFamily extends HasFins {
  public default int getNumberOfFins() {
    return 8;
  }
  public double getLongestFinLength();
  public default boolean doFinsHaveScales() {
    return false;
  }
}
