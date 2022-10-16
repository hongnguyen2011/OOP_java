import java.util.Scanner;
public class HillPattern {
    public static void main(String[] args) {
//            a)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int row = size-1; row>= 0; row--)
        {
            for (int col=0; col<row; col++)
            {
                System.out.print(" ");
            }
            for (int side=row; side<=size-1; side++)
            {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
        System.out.println("a)");

        //        b)
        for (int row = 0; row <= size-1 ; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int side = row; side <= size - 1; side++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
        System.out.println("b)");
//        c)
        for(int row = size; row >= 1; row--){
            for(int col = 1; col <= 2 * size - row; col++){
                if(col >= row){
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        for(int row = 2; row <= size; row++){
            for(int col = 1; col <= 2 * size - row; col++){
                if(col >= row){
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("c)");

//        d)
        for ( int row =1;row <= 2*size-1;row++) {
            for ( int col=1;col<= size*2-1;col++ ) {
                if (col + row <= size + 1  || col + size <= row +1 || row <= col-size+1 || col + row >= 3*size-1) {
                    System.out.print("# ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("d)");
    }
}
