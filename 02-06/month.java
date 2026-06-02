//Problem: Get day , month , year and print the next date

import java.util.Scanner;

public class month {

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return 31;

            case 4: case 6: case 9: case 11:
                return 30;

            case 2:
                return isLeapYear(year) ? 29 : 28;

            default:
                return -1;
        }
    }

    static void nextDate(int day, int month, int year) {

        int maxDays = getDaysInMonth(month, year);

        if (day < 1 || day > maxDays) {
            throw new IllegalArgumentException("Invalid Date");
        }

        day++;

        if (day > maxDays) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("Next Date: " +
                day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Day: ");
            int day = sc.nextInt();

            System.out.print("Enter Month: ");
            int month = sc.nextInt();

            System.out.print("Enter Year: ");
            int year = sc.nextInt();

            nextDate(day, month, year);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}