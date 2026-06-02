import java.util.Scanner;

public class transaction {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        String str = String.valueOf(num);

        int[] count = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            count[digit]++;

            if (count[digit] > 3) {
                System.out.println("Invalid");
                return;
            }
        }

        System.out.println("Valid");
    }
}