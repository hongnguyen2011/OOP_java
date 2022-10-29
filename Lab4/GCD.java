import java.util.Scanner;
public class GCD {
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
