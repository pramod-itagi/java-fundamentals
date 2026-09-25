package Theory;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateAndTime {
  public static void main(String[] args) {
    /*
     * JODA: Java Object Date and Time:
     * It is a library that provides a set of classes and interfaces for working
     * with
     * dates and times.
     */

    /*
     * With Java 8, we have a new package called java.time which provides a set of
     * classes and interfaces for working with dates and times and few features of
     * JODA were included.
     * 
     * Three classes provided by java.time package:
     * 1. LocalDate
     * 2. LocalTime
     * 3. LocalDateTime
     * 
     * To use these, we need to import java.time package.
     */

    /*
     * LocalDate:
     * It is used to represent a date without a time.
     */
    LocalDate now = LocalDate.now();
    // now() static method returns the current date.
    System.out.println(now); // 2026-09-25

    /*
     * Some of the methods of LocalDate class:
     * 
     * getYear():
     * Returns the year of the date.
     * 
     * getDayOfTheWeek():
     * Returns the day of the week of the date.
     * 
     * getDayOfTheMonth():
     * Returns the day of the month of the date.
     * 
     * getDayOfTheYear():
     * Returns the day of the year of the date.
     * 
     */
    int year = now.getYear();
    System.out.println(year); // 2026

    /* To get Day of the Week */
    DayOfWeek dayOfWeek = now.getDayOfWeek();
    System.out.println(dayOfWeek); // FRIDAY

    int dayOfTheWeek = now.getDayOfWeek().getValue();
    System.out.println(dayOfTheWeek); // 5

    int dayOfTheMonth = now.getDayOfMonth();
    System.out.println(dayOfTheMonth); // 25

    int dayOfTheYear = now.getDayOfYear();
    System.out.println(dayOfTheYear); // 268

    // To find whether the year is a leap year or not
    boolean isLeapYear = now.isLeapYear();
    System.out.println(isLeapYear); // false

    // Finding length of the month
    int lengthOfTheMonth = now.lengthOfMonth();
    System.out.println(lengthOfTheMonth); // 30

    // Finding length of the year
    int lengthOfTheYear = now.lengthOfYear();
    System.out.println(lengthOfTheYear); // 365

    // Adding 100 days to the current date
    now.plusDays(100);

    // Adding 100 months to the current date
    now.plusMonths(100);

    // Adding 100 years to the current date
    now.plusYears(100);

    // Subtracting 100 days from the current date
    now.minusDays(100);

    /*
     * LocalTime:
     * It is used to represent a time without a date.
     */
    LocalTime timeNow = LocalTime.now();
    System.out.println(timeNow); // 13:54:40.219099

    // Setting a specific time
    LocalTime time = LocalTime.of(10, 10, 10);
    System.out.println(time); // 10:10:10

    /*
     * LocalDateTime:
     * It is used to represent a date and time.
     */
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    // 2026-09-25T13:54:40.219143

    // Setting a specific date and time
    LocalDateTime ldt = localDateTime.of(2026, 10, 10, 10, 10, 10);
    System.out.println(ldt);

    /*
     * of():
     * of() static method is used to set a specific date and time. This is
     * applicable for LocalDate, LocalTime and LocalDateTime.
     */

    /*
     * Setting specific date or time when its already given
     */
    LocalDate date = LocalDate.of(2026, 10, 10);
    date.withDayOfMonth(6);
    System.out.println(date); // 2026-10-06

    /*
     * Compare dates:
     */
    LocalDate date1 = LocalDate.of(2026, 10, 10);
    LocalDate date2 = LocalDate.of(2026, 10, 11);
    System.out.println(date1.isBefore(date2)); // true
    System.out.println(date1.isAfter(date2)); // false
    System.out.println(date1.equals(date2)); // false
  }
}
