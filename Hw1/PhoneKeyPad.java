import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inChar = sc.nextLine().toLowerCase();

        for (int charId = 0; charId < inChar.length(); charId++) {
            switch (inChar.charAt(charId)){
                case 'a','b','c':
                    System.out.print("2");
                    break;
                case 'd','e','f':
                    System.out.print("3");
                    break;
                case  'g','h','i':
                    System.out.print("4");
                    break;
                case 'j','l','k':
                    System.out.print("5");
                    break;
                case 'm','n','o':
                    System.out.print("6");
                    break;
                case 'p','q','r','s':
                    System.out.print("7");
                    break;
                case 't','u','v':
                    System.out.print("8");
                    break;
                case 'w','x','y','z':
                    System.out.print("9");
                    break;

            }
        }
    }

}
