import java.util.Scanner;
//A simple program to accept the year and check whether it is a leap year and then accept month and tell no. of days in that month 
public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean leapYear = false;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            leapYear = true;
        }

        int days;

        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                days = 31;
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                break;

            case 2:
                days = leapYear ? 29 : 28;
                break;

            default:
                System.out.println("Invalid month!");
                return;
        }

        System.out.println(year + (leapYear ? " is a Leap Year." : " is not a Leap Year."));
        System.out.println("Number of days in month " + month + " = " + days);

        sc.close();
    }
}