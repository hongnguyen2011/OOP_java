import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println();
        for(int row = 0; row <= size-1; row++)
        {
            for(int col = 0; col <= size-1; col++)
            {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
