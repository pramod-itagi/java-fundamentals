package Problems;

import java.util.Scanner;

public class Calender {

  private static String determineNameOfTheDay(int number) {
    switch (number) {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      default:
        return "Invalid day number";
    }
  }

  private static boolean isWeekDay(int day2) {
    switch (day2) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return true;
      case 6:
      case 0:
        return false;
      default:
        return false;
    }
  }

  private static String determineNameOfTheMonth(int numberMonth) {
    switch (numberMonth) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Invalid month number";
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter the day number: ");
    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    String nameOfTheDay = determineNameOfTheDay(day);
    System.out.println(nameOfTheDay);

    System.out.println("Check whether given day is weekday or not");
    System.out.print("Enter the day number: ");
    int day2 = scanner.nextInt();
    boolean isTheDayIsWeekDay = isWeekDay(day2);
    System.out.println(isTheDayIsWeekDay);

    System.out.println("Determine name of the month");
    System.out.print("Enter the number month: ");
    int numberMonth = scanner.nextInt();
    System.out.println(determineNameOfTheMonth(numberMonth));
  }

}
