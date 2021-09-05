package chapter3;
import java.time.*;
import java.time.format.*;
public class FormattingDatesAndTimes {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(dateTime.format(shortDateTime));
    System.out.println(date.format(shortDateTime));
    System.out.println(time.format(shortTime));
  }
}
