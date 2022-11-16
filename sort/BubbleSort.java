package sort;

public class BubbleSort implements ISort {
    public int sort(int[] data) {
        int numberOfSwap = 0; // so lan doi
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    numberOfSwap++;
                }
            }
        }
        return numberOfSwap;
    }
}