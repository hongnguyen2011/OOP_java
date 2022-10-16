import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
    public static int[] importArray() {
        Scanner sc = new Scanner(System.in);
        int NUM_ITEMS;
        do {
            System.out.print("Enter the number of items ( >0 ): ");
            NUM_ITEMS = sc.nextInt();
        } while (NUM_ITEMS <= 0);

        int[] arr = new int[NUM_ITEMS];
        System.out.printf("Enter the value of %d items (separated by space): ", NUM_ITEMS);
        for (int idx = 0; idx < NUM_ITEMS; idx++) {
            arr[idx] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static String arrayToString(int[] array) {

        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int[] arr = importArray();
        System.out.println(arrayToString(arr));
    }
}
