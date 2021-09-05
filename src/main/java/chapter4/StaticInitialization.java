package chapter4;
public class StaticInitialization {
  int num;
  //private static final int one;//DOES NOT COMPILE
  private final int two;
  static {
    //num = 1;//DOES NOT COMPILE
    int numSecondsPerMinute = 60;
    int numSecondsPerHour = 60;
    NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numSecondsPerHour;
  }
  StaticInitialization() {
    //one = 1;
    two = 2;
  }
  public static void main(String[] args) {
    System.out.println(NUM_SECONDS_PER_HOUR);
  }
  private static final int NUM_SECONDS_PER_HOUR;
}
