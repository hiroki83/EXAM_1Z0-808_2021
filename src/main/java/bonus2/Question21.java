package bonus2;
public class Question21 {
  public static void main(String[] args) {
    int x = 10;
    switch(x % 4) {
      default: System.out.print("Not divisible by 4");
      case 0: System.out.print("divisible by 4");
    }
  }
}
