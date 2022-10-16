public class FactorialLong {
    public static void main(String[] args) {
        factorialInt();
        factorialLong();
    }

    public static void factorialInt() {
        int f = 1;
        int x = 1;
        while (true) {
            System.out.println("The factorial of " + x + " is: " + f);
            if (Integer.MAX_VALUE / f < x + 1) {
                System.out.println("The factorial of " + (x + 1) + " is out of range ");
                break;
            }
            x++;
            f = f * (x);

        }
    }

    public static void factorialLong() {
        long f = 1;
        int x = 1;
        while (true) {
            System.out.println("The factorial of " + x + " is: " + f);
            if (Long.MAX_VALUE / f < x + 1) {
                System.out.println("The factorial of " + (x + 1) + " is out of range ");
                break;
            }
            x++;
            f = f * (x);

        }
    }
}
