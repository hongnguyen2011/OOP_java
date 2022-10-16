import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x and num : ");
        double x = in.nextDouble();
        int num = in.nextInt();
        System.out.println(
                "The DIF betweet JDK methods Math. and the sum of sin : "
                        + Math.abs(sin(x, num) - Math.sin(x)));
        System.out.println(
                "The DIF betweet JDK methods Math. and the sum of cos : "
                        + Math.abs(cos(x, num) - Math.cos(x)));
        in.close();
    }

    public static double evaluate(double x, int num) {
        double result = 1;
        for (int i = 0; i < num; i++) {
            result *= x / (num - i);
        }
        return result;
    }

    public static double sin(double x, int num) {
        double result = x;
        int t = 1;
        for (int i = 3; i <= num; i += 2) {
            result += Math.pow(-1, t) * evaluate(x, i);
            t += 1;
        }
        return result;
    }

    public static double cos(double x, int num) {
        double result = 1;
        int t = 1;
        for (int i = 2; i <= num; i += 2) {
            result += Math.pow(-1, t) * evaluate(x, i);
            t += 1;
        }
        return result;
    }
}

