import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        int inStrLen = inStr.length();
        for (int charIdx = inStrLen-1;charIdx >= 0 ;charIdx--){
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
