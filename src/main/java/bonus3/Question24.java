package bonus3;
import java.time.*;
import java.time.format.*;
public class Question24 {
  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    DateTimeFormatter f = DateTimeFormatter.ofPattern("ss ? yyyy ^ mm");
    System.out.println(f.format(d));
  }
}
