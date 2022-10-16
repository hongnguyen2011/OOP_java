import  java.util.Scanner;
public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = x;
        double value = x;
        for (int i = 1; i < numTerms; i++) {
            double numerator = (i * 2 - 1) * (value * x * x);
            double denominator = (i * 2);
            value = numerator / denominator;
            result += value / (i * 2 + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int numTerms = sc.nextInt();
        System.out.print(specialSeries(x, numTerms));
    }
}

