import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();
        System.out.print("Enter the input Radix: ");
        int inRadix = scan.nextInt();
        System.out.print("Enter the output Radix: ");
        int outRadix = scan.nextInt();
        scan.close();
        int dec = changeRadixNToDec(str, inRadix);
        if (dec == -1) {
            System.out.println("Invalid input");
        } else {
            String result = changeDecToRadixM(dec, outRadix);
            System.out.printf("%s in radix %d is %s in radix %d ", str, inRadix, result, outRadix);
        }

    }

    public static int changeRadixNToDec(String str, int inRadix) {
        int num;
        char ch;
        int decNum = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                num = ch - '0';
            } else {
                num = ch - 'a' + 10;
            }

            if (num >= 0 && num <= inRadix - 1) {
                decNum = decNum * inRadix + num;
            } else {
                return -1;
            }

        }
        return decNum;
    }

    public static String changeDecToRadixM(int dec, int outRadix) {
        int reDun;
        char ch;
        StringBuilder numRadix = new StringBuilder();
        while (dec > 0) {
            reDun = dec % outRadix;
            numRadix.insert(0, Character.forDigit(reDun, outRadix));
            dec = dec / outRadix;
        }
        return numRadix.toString().toUpperCase();
    }
}