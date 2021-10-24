package bonus3;
public class Question9 {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 0, 2};
    Object p = nums;
    int[] two = (int[]) p;
    System.out.println(10 / two[2]);
  }
}
