import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println();
        for(int row = 1; row <= size; row++)
        {
            for(int col = 1; col <= size; col++)
            {
                int res = row * col;
               System.out.print(res + " ");

            }
            System.out.println();
        }
    }
}
