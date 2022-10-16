import java.util.Scanner;

public class Dec2Hex {

    public static int importDecNumber() {
        Scanner sc = new Scanner(System.in);
        int numDec;
        do {
            System.out.print("Enter a decimal number: ");
            numDec = sc.nextInt();
        } while (numDec < 0);
        sc.close();
        return numDec;
    }

    public static String reverseString(String inString) {
        int inStrLen = inString.length();
        String reverseString = "";
//        StringBuilder reverseString = new StringBuilder();
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            reverseString += inString.charAt(charIdx);
//            reverseString.append(inString.charAt(charIdx));
        }
        return reverseString.toString();
    }

    public static String changDecToHex(int numDec, String[] hex) {
        String strHex = "";
        int remainder;
        while (numDec > 0) {
            remainder = numDec % 16;
            strHex += hex[remainder];
            numDec /= 16;
        }
        strHex = reverseString(strHex);
        return strHex;
    }

    public static void main(String[] args) {
        final String[] HEX = {"0", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F"};
        int numDec = importDecNumber();
        System.out.printf("The equivalent hexadecimal number is: %s", changDecToHex(numDec, HEX));
    }
}
