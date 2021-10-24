package bonus2;
public class Question18 {
  public static void main(String[] args) {
    java.util.List differentTypes = new java.util.ArrayList();
    differentTypes.add("goldfish");
    differentTypes.add(0, false);
    differentTypes.add(1);
    differentTypes.remove(1);
    boolean b1 = differentTypes.contains("goldfish");
    boolean b2 = differentTypes.contains(new Boolean(false));
    boolean b3 = differentTypes.contains(1);
    System.out.println(b1 + " " + b2 + " " + b3);
    System.out.println(differentTypes);
  }
}
