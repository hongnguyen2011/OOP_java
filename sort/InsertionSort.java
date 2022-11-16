package sort;

public class InsertionSort implements ISort {
    public int sort(int[] data) {
        int numberOfSwap = 0; // so lan doi
        int n = data.length;
        for (int i = 1; i < data.length -1; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
                numberOfSwap++;
            }
            data[j + 1] = key;
        }
        return numberOfSwap;
    }
}
