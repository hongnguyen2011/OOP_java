import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound : ");
        int number = in.nextInt();
        in.close();
        int count = 0;
        for (int idx = 2; idx <= number; idx++)
            if (isPrime(idx)) {
                System.out.println(idx);
                count++;
            }
        double percent = 100.00 * count / number;
        System.out.printf("Primes found :%d", count);
        System.out.printf(" (%.2f", percent);
        System.out.println("%)");
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
