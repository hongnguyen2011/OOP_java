import java.util.Scanner;
public class TestPalindromicWord {
    public static void run(String word)
    {
        String reverseWord = "";
        for(int i = word.length() - 1; i >= 0 ; i--) {
            reverseWord += word.toLowerCase().charAt(i);
        }
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.printf("%1$s is a palindrome.\n", word);
        } else {
            System.out.printf("%1$s is not a palindrome.\n", word);
        }
    }

    public static void main(String[] args) {
        TestPalindromicWord aTestPalindromicWord = new TestPalindromicWord();
        Scanner sc = new Scanner(System.in);
        String  word;
        System.out.print("Please enter a word to test it: ");
        word = sc.next();
        aTestPalindromicWord.run(word);
    }


}