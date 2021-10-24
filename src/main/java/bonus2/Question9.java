package bonus2;
public class Question9 {
  public static void main(String[] args) {
    String tiger = "Tiger";
    String lion = "Lion";
    //final String statment = 250 > 338 ? lion : tiger = "is Bigger";
    final String statment = 250 > 338 ? lion : (tiger = "is Bigger");
    System.out.println(statment);
  }
}
