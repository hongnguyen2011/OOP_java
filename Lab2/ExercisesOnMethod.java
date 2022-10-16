import java.util.Arrays;
import java.util.Scanner;

public class ExercisesOnMethod {

    public static boolean contains(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx + 1;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int idx = 0; idx < array1.length; idx++) {
            if (array1[idx] != array2[idx]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        int[] arrCopy = Arrays.copyOf(array, array.length);
        return arrCopy;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int idx = 0; idx < array1.length; idx++) {
            int temp = array1[idx];
            array1[idx] = array2[idx];
            array2[idx] = temp;
        }
        return true;
    }

    public static void reverse(int[] arrray) {
        for (int idx = 0; idx < arrray.length / 2; idx++) {
            int temp = arrray[idx];
            arrray[idx] = arrray[arrray.length - 1 - idx];
            arrray[arrray.length - 1 - idx] = temp;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = sc.nextInt();
        sc.nextLine();
        int[] array = new int[numItems];

        for (int idx = 0; idx < numItems; idx++) {
            array[idx] = sc.nextInt();
        }
//        System.out.print("Enter key: ");
//        int key = sc.nextInt();
//        sc.nextLine();
//        System.out.println(contains(array, key) == true ? "Array contains " + key : "Array is not contains " + key);
//
//        System.out.println("index of " + key + " is " +  search(array, key));

        System.out.print("Enter the number of items for array2: ");
        int numItems2 = sc.nextInt();
        sc.nextLine();
        int[] array2 = new int[numItems2];

        for (int idx = 0; idx < numItems2; idx++) {
            array2[idx] = sc.nextInt();
        }

//        System.out.println(equals(array, array2) == true ? "Array1 equals Array2" : "Array1 not equals Array2");

//        copyOf
//        System.out.println(Arrays.toString(copyOf(array)));
    }
}
