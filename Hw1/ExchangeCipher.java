import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toUpperCase();

        for (int charId = inStr.length()-1;charId >= 0  ; charId--) {
            System.out.print((char) (inStr.charAt(charId)));
            }
        }

}
