import java.util.Scanner;
public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
//        a)
        for (int row = 1; row <=size; row++) {
            for (int col = 1; col <= size; col++)
                if((row==1 || row==size) || (col==1 || col==size))
                    System.out.print("#");
                else
                    System.out.print(" ");

            System.out.println();

        }
        System.out.println("a)");
//        b)
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1 || row == col  ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("b)");
//        c)
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1 || col == size - 1 - row) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("c)");
//        d)
        for (int row = 1; row <= size; row++) {
            for(int col = 1; col <= size; col++){
                if(row == 1 || row == size || col + row == size + 1 || row == col){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("d)");
    }
}
