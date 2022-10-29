import java.util.Scanner;
//Length of a Running Number Sequence (recursive)
public class LengthNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = in.nextInt();
        in.close();
        System.out.println("The length number sequence is : ");
        System.out.print(numOfDigits(n));
    }

//    count digit >= 10
    public static int numOfDigits(int number) {
        int result = 1;
        while (number >= 10) {
            number /= 10;
            result++;
        }
        return result;
    }

    public static int length(int n) {
        if (n == 1) {
            return 1;
        } else {
            return length(n - 1) + numOfDigits(n);
        }
    }
}


