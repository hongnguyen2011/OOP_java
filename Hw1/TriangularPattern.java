import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size: ");
            int size = sc.nextInt();
//            a)
        for(int row=0; row<size; row++)
            {
                for(int col =0; col <= row; col++)
                {
                    System.out.print("#");
                }
                System.out.println();
            }
        System.out.println("a)");
//            b)
        for(int row=size-1; row>=0; row--)
        {
            for(int col =0; col <= row; col++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("b)");
//        c)
        for(int row=size; row>=1; row--)
        {
            for(int col = size; col > row; col--)
            {
                System.out.print(" ");
            }
            for (int rightRow=1;rightRow<=row;rightRow++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("c)");
//        d)
        for(int row=0; row<=size; row++)
        {
            for(int col = 1; col <= size - row; col++)
            {
                System.out.print(" ");
            }
            for (int rightRow=0;rightRow<=row;rightRow++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("d)");

    }
}
