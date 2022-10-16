public class FibonacciInt {
    public static void main(String[] args) {
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int idx = 2;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        int max = Integer.MAX_VALUE;
        while ((max - fnMinus2) > fnMinus1) {
            fn = fnMinus2;
            fnMinus2 = fnMinus2 + fnMinus1;
            fnMinus1 = fn;
            System.out.println("F(" + idx + ") = " + fnMinus2);
            idx++;
        }
        System.out.print("F(" + idx + ") is out of the range of int");
    }
}
