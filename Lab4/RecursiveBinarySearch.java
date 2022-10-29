public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(array, 8));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx) {
            if (array[fromIdx] == key) {
                return true;
            } else {
                return false;
            }
        }
        int midIdx = (fromIdx + toIdx) / 2;
        if (array[midIdx] == key) {
            return true;
        }
        if (array[midIdx] > key) {
            toIdx = midIdx - 1;
        } else {
            fromIdx = midIdx + 1;
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }
}
