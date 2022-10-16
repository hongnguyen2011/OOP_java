import java.util.Scanner;

public class Hex2Bin {

    private static final int HEX_RADIX = 16;

    public static String importString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inString = sc.next();
        sc.close();
        return inString;
    }

    public static boolean isHex(String hexStr) {
        for (int chIdx = 0; chIdx < hexStr.length(); chIdx++) {
            if (Character.digit(hexStr.charAt(chIdx), HEX_RADIX) > 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static String changHex2Bin(String hexStr, String[] hexBits) {
        String strBin = "";
        for (int idx = 0; idx < hexStr.length(); idx++) {
            int digit = Character.digit(hexStr.toUpperCase().charAt(idx), HEX_RADIX);
            strBin += hexBits[digit] + " ";
        }
        return strBin;
    }

    public static void main(String[] args) {
        final String[] hexBits = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        String hexStr = importString();
        if (isHex(hexStr)) {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %s", hexStr, changHex2Bin(hexStr, hexBits));
        } else {
            System.out.printf("Invalid Hexadecimal string \"%s\"\n", hexStr);
        }
    }
}
