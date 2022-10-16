import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateUtil {
    public static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public final String[] strDays = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static final int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

        int lastTwoDigitsOfYear = year % 100;

        int magicYearNumber = lastTwoDigitsOfYear / 4;

        int magicMonthNumber =
                isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

        int magicDayNumber = day;

        return (magicCenturyNumber
                + lastTwoDigitsOfYear
                + magicYearNumber
                + magicMonthNumber
                + magicDayNumber)
                % 7;
    }

    public void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    public String toString(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        DateUtil aDateUtil = new DateUtil();
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));
        System.out.println();
        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));
        System.out.println();
        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));
        System.out.println();
        System.out.println(aDateUtil.toString(2012, 2, 14)); // Tue012
    }
}
