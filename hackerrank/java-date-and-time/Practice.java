import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author sally
 */
public class Practice {

  public static String findDay(int month, int day, int year) {
    Calendar rightNow = Calendar.getInstance();
    rightNow.set(year, month - 1, day);

    System.out.println(rightNow.getTime());
    return rightNow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
  }

  public static void main(String[] args) {

    findDay(8, 5, 2015);
  }
}
