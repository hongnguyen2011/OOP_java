package sort;

public class App {
    public static void main(String[] args) {
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        print(array, new BubbleSort());
        print(array, new InsertionSort());
        print(array, new SelectionSort());

    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print(int[] array, ISort sort) {

        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);


        SortStrategy sortStrategy = SortStrategy.getInstance();
//        BubbleSort
        if (sort instanceof BubbleSort) {
            System.out.println("Using Bubble sort");
            sortStrategy.setSortee(new BubbleSort());
//            InsertionSort
        } else if (sort instanceof InsertionSort) {
            System.out.println("Using Insertion sort");
            sortStrategy.setSortee(new InsertionSort());
//        SelectionSort
        } else {
            System.out.println("Using Selection sort");
            sortStrategy.setSortee(new SelectionSort());
        }

        System.out.print("Array before: ");
        print(newArray);
        int numberOfSwap = sortStrategy.sort(newArray);
        System.out.print("Array after: ");
        print(newArray);
        System.out.println("Number of swap: " + numberOfSwap);

    }
}

