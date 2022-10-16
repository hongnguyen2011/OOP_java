import java.util.Scanner;

public class TestPalindWord {
    public static void run(String orginWord) {

        String word = orginWord.toLowerCase();
        int wordLength = word.length();
        int check = 1;          // 1 is a palind str | 0 is not
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(wordLength - i - 1)) {
                check = 0;
            }
        }
        if (check == 1) {
            System.out.printf("%1$s is a palindrome.\n", orginWord);
        } else {
            System.out.printf("%1$s is not a palindrome.\n", orginWord);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word to test it: ");
        String orginWord = sc.nextLine();
        run(orginWord);
    }
}
