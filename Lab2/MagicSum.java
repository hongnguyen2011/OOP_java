import java.util.Scanner;

public class MagicSum {
    public static boolean isEight(int number) {
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            if (remainder == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int sumNumberEight() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter a positive integer (or −1 to end): ");
            number = sc.nextInt();
            if (isEight(number)) {
                sum += number;
            }
        } while (number != -1);
        sc.close();
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("The magic sum is: " + sumNumberEight());
    }
}
