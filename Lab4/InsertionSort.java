public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 43, 23, 4, 1, 4, 6, 1, -3};
        insertionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int[] result;
        result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            for (; index < i; ++index) {
                if (result[index] > array[i]) {
                    break;
                }
            }
            insert(result, index, array[i]);
        }
        copy(array, result);
    }

    public static void copy(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array2[i];
        }
    }

    public static void insert(int[] array, int index, int key) {
        int current = 0;
        for (int i = index; i < array.length; ++i) {
            if (i == index) {
                current = array[i];
                array[i] = key;
            }
            else {
                int temp;
                temp = array[i];
                array[i] = current;
                current = temp;
            }
        }
    }
}
