import java.util.Scanner;

public class DecipherCaesarsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toUpperCase();

        for (int charId = 0; charId < inStr.length(); charId++) {
            switch (inStr.charAt(charId)) {
                case 88, 89, 90, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85,86, 87:
                    System.out.print(((char) (inStr.charAt(charId) - 3)));
                    break;
                case 65, 66, 67:
                    System.out.print((char) inStr.charAt(charId));
            }
        }
    }
}
