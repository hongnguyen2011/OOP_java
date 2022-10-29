import java.util.Scanner;
public class Ex3_GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number a : ");
        int numbera = in.nextInt();
        System.out.print("Please enter the number b : ");
        int numberb = in.nextInt();
        System.out.println(
                gcd(numbera, numberb) + " is the greatest factor that divides both a and b ");
        in.close();
    }

    public static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
