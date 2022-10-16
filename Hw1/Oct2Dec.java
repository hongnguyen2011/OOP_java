import java.util.Scanner;

public class Oct2Dec {
    public static boolean isValid(int inNum) {
        int digit;
        while (inNum > 0) {
            digit = inNum % 10;
            if (digit > 8) {
                return false;
            }
            inNum /= 10;
        }
        return true;
    }


    public static int changeOctalToDec(int inNum) {
//        int decNum = 0;
//        int pcNum;
//        int deviceCount = 0;
//        while (inNum > 0) {
//            pcNum = inNum % 10;
//
//            decNum = decNum + pcNum * (int) Math.pow(8, deviceCount);
//            deviceCount++;
//            inNum /= 10;
//        }
////        decNum = (int)decNum;
//
//        return decNum;
         int f;
         int[] a = new int[10005];
         ư



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int inNum = in.nextInt();
        while (!isValid(inNum)) {
            System.out.print("Please check again: ");
            inNum = in.nextInt();
        }
        int res = changeOctalToDec(inNum);

        System.out.print(res);

    }
}

