package sort;

public class SelectionSort implements ISort {
    public int sort(int[] data) {
        int numberOfSwap = 0; // so lan doi
        for (int i = 0; i < data.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < data.length -1; j++) {
                if (data[j] < data[min_idx]) {
                    min_idx = j;
                    numberOfSwap++;
                }
            }
            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
        return numberOfSwap;
    }
}
