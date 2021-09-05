package chapter4;
public class WorkingWithVarargs {
  public static void walk(int start, int... nums) {
    if (nums != null)
      System.out.println(nums.length);
    else
      System.out.println(nums);
  }
  public static void main(String[] args) {
    walk(1);
    walk(1, 2);
    walk(1, 2, 3);
    walk(1, new int[] {4, 5});
    walk(1, null);
  }
}
