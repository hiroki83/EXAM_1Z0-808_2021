package bonus1;
public class Question26 {
  public static void main(String[] args) {
    String year = "Japanese";
    switch(year) {
      case "Freshman":
      default :
        System.out.println("default");
      case "Sophomore":
        System.out.println("Sophomore");
      case "Junior":
        System.out.println("See you next year");
        break;
      case "Senior":
        System.out.println("Congratulations");
    }
  }
}
