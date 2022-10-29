import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper bound:");
        int upperBound = scan.nextInt();
        perfectPrimeFactorList(upperBound);

    }

    public static boolean isProductOfPrimeFactors(int number) {
        int product = 1;
        for (int i = 2; i < number; i++) {
            if (isPrime(i) && number % i == 0) {
                product *= i;
            }
        }
        if (product == number) {
            return true;
        }
        return false;
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

    public static void perfectPrimeFactorList(int upperBound) {
        System.out.println("These numbers are equal to the product of prime factors: ");
        int count = 0;
        for (int i = 2; i < upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, (float) count*100 / upperBound);
    }
}

