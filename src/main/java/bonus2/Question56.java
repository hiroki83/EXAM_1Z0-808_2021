package bonus2;
import java.time.*;
import java.time.format.*;
public class Question56 {
  public static void main(String[] args) {
    LocalDate d = LocalDate.of(2015, 5, 7);
    Period p = Period.of(1,2,3);
    d = d.minus(p);
    //DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);//RuntimeException
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    System.out.println(f.format(d));
  }
}
