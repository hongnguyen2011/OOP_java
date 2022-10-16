import java.util.Scanner;
public class CountVowelsDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        int countNumber = 0;
        int countVowels = 0;
        for (int charIdx = 0;charIdx <= inStr.length()-1;charIdx++){
            switch (inStr.charAt(charIdx)){
                case 65,69,73,79,85,97,101,105,111,117:
                    countVowels++;
                    break;
                case '0','1','2','3','4','5','6','7','8','9:
                    countNumber++;
            }
        }
        System.out.println(countVowels);
        System.out.println(countNumber);
    }
}
