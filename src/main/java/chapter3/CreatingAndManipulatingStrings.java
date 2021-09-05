package chapter3;
public class CreatingAndManipulatingStrings {
  public static void main(String[] args) {
    String  string = "animals";
    int index = string.indexOf(105);
    System.out.println("'animals' substring from index 0 to index 0 ="+string.substring(0,0));
    System.out.println("'animals' substring from 'n' to index 6 ="+string.substring(string.indexOf('n'),6));
    System.out.println("'animals' substring from 'n' to index 7 ="+string.substring(string.indexOf('n'),7));
    System.out.println("'animals' substring from 'n' to index 8 ="+string.substring(string.indexOf('n'),8));
  }
}
