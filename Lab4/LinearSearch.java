public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        if (linearSearch(array,9)){
            System.out.println("The key is found inside the array");
            System.out.print("The key index in array: ");
            System.out.print(linearSearchIndex(array,5));
        }
        else {
            System.out.println("The key is not found inside the array");
        }

    }

    public static boolean linearSearch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        //  If not found, return 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }
}
