import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 1, 5, 6, 7, 7, 36, 28};
        selectionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int t = 0; t < array.length; t++) {
            int minIdx = t;
            for (int i = t; i < array.length; i++) {
                if (array[minIdx] > array[i]) {
                    minIdx = i;
                }
            }
            swap(array, t, minIdx);
        }
    }

    public static void swap(int[] array, int idex1, int idex2) {
        int temp = array[idex1];
        array[idex1] = array[idex2];
        array[idex2] = temp;
    }

}
