import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "testing";
        System.out.println("java WorldGuess testing");
        int count = 0;
        int length = word.length();
        Character[] array = new Character[length];
        for (int idx = 0; idx < length; idx++) {
            array[idx] = '_';
        }
        while (!word.equals(stringArray(array))) {
            System.out.print("Key in one character or your guess word: ");
            String key = in.next();
            if (key.equals(word)) {
                count++;
                break;
            }
            if (key.length() > 1) continue;
            if (find(array, key.charAt(0)) == true) {
                continue;
            }
            for (int idx = 0; idx < length; idx++) {
                String c = String.valueOf(word.charAt(idx));
                if (key.equals(c)) array[idx] = c.charAt(0);
            }
            count++;
            System.out.println("Trial " + count + ": " + stringPrint(array));
        }
        System.out.println("Key in one character or your guess word: " + word);
        System.out.println("Congratulation!");
        System.out.print("You got in " + count + " trials");
        in.close();
    }

    public static String stringArray(Character[] array) {
        String word = "";
        for (int idx = 0; idx < array.length; idx++) {
            word += array[idx];
        }
        return word;
    }

    public static String stringPrint(Character[] array) {
        String word = "";
        for (int idx = 0; idx < array.length; idx++) {
            word += array[idx] + " ";
        }
        return word;
    }

    public static boolean find(Character[] array, Character key) {
        for (Character element : array) {
            if (key.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
