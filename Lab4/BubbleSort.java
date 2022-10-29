public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 1, 5, 6, 7, 7, 36, 28};
        bubbleSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        //    Sort increasing array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
