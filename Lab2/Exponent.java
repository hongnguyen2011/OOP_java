import java.util.Scanner;

public class Exponent {
    public static int returnExponent(int base, int exp) {
        int exponent = 1;
        for (int point = 1; point <= exp; point++) {
            exponent *= base;
        }
        return exponent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        System.out.printf("%d raises to power of %d is: %d", base, exp, returnExponent(base, exp));
    }
}
