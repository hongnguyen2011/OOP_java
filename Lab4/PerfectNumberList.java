import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper bound:");
        int bound = scan.nextInt();
        perfectNumberList(bound);
    }
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int idx = 1; idx <= aPosInt / 2; idx++) {
            if (aPosInt % idx == 0) sum += idx;
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }
    public static boolean isDeficient(int aPosInt){
        int sum = 0;
        for (int i =1; i<aPosInt; i++){
            if (aPosInt % i == 0){
                sum += i;
            }
            if (sum>=aPosInt){
                return false;
            }

        }
        return true;
    }
    public static void perfectNumberList(int upperBound){
        ArrayList<Integer> perfectNums= new ArrayList<>();
        ArrayList<Integer> deficientNums= new ArrayList<>();
        ArrayList<Integer> normalNums= new ArrayList<>();
        for (int i =1; i<=upperBound; i++){
            if ( isDeficient(i) ){
                deficientNums.add(i);
            }
            else if (isPerfect(i)){
                perfectNums.add(i);
            }
            else{
                normalNums.add(i);
            }

        }
        System.out.println("These numbers are perfect:");
        for (int i =0; i<perfectNums.size(); i++){
            System.out.print(perfectNums.get(i)+" ");
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n",perfectNums.size(),(float)perfectNums.size()*100/upperBound);
        //
        System.out.println("These numbers are neither deficient nor perfect:");
        for (int i =0; i<normalNums.size(); i++){
            System.out.print(normalNums.get(i)+" ");
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]\n",normalNums.size(),(float)normalNums.size()*100/upperBound);
    }
}
