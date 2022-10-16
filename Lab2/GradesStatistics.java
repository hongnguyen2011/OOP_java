import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] inputNumberStudent() {
        Scanner sc = new Scanner(System.in);
        int numStudents;
        do {
            System.out.print("Enter the number of students(>0): ");
            numStudents = sc.nextInt();
        } while (numStudents <= 0);

        int[] grades = new int[numStudents];
        for (int idx = 0; idx < numStudents; idx++) {
            do {
                System.out.printf("Enter the grade for student %d (0-100): ", idx + 1);
                grades[idx] = sc.nextInt();
            } while (grades[idx] < 0 || grades[idx] > 100);
        }
        sc.close();
        return grades;
    }

    public static double median(int[] array) {
        double med;
        if (array.length % 2 == 0) {
            int idx = (array.length - 1) / 2;
            med = (double) (array[idx] + array[idx + 1]) / 2;
            return med;
        } else {
            int idx = array.length / 2;
            med = array[idx];
            return med;
        }
    }

    public static double stdDev(int[] array) {
        double result = 0;
        double mean = returnAverage(array);
        for (int idx = 0; idx < array.length; idx++) {
            result += (array[idx] - mean) * (array[idx] - mean);
        }
        result = result / array.length;
        result = Math.sqrt(result);
        return result;
    }

    public static int returnMin(int[] array) {
        int min = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < min) {
                min = array[idx];
            }
        }
        return min;
    }

    public static int returnMax(int[] array) {
        int max = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < max) {
                max = array[idx];
            }
        }
        return max;
    }

    public static double returnAverage(int[] array) {
        double sum = 0;
        for (int idx : array) {
            sum += idx;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] grades = inputNumberStudent();

        System.out.println(Arrays.toString(grades));
        System.out.printf("The average is: %.2f\n", returnAverage(grades));
        System.out.printf("The minimum is: %d\n", returnMin(grades));
        System.out.printf("The maximum is: %d\n", returnMax(grades));
        Arrays.sort(grades);
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }
}
