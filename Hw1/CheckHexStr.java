import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toLowerCase();
        int check = 1;
        for (int charId = 0;charId<inStr.length();charId++){
            if (!((inStr.charAt(charId) >= 97 && inStr.charAt(charId) <= 102)
                    || (inStr.charAt(charId) >= 48 && inStr.charAt(charId) <= 57))){
                check = 0;
            }
        }
        if (check == 0){
            System.out.println(inStr + " is not a hex string");
        }else {
            System.out.println(inStr + " is a hex string");
        }
    }
}
