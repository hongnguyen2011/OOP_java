import java.util.Scanner;
//Fibonacci Recusive
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci : ");
        int n = in.nextInt();
        in.close();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
