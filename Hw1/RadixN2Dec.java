import java.util.Scanner;

public class RadixN2Dec {

    public static int changeBinToDec(int inNum) {
        double decNum = 0;
        double pcNum;
        int diviceCount = 0;
        int check = 1;

        while (inNum > 0) {
            pcNum = inNum % 10;
            if (pcNum != 0 && pcNum != 1) {
                check = 0;
            }
            decNum = decNum + pcNum * Math.pow(2, diviceCount);
            diviceCount++;
            inNum /= 10;
        }

        if (check == 1) {
            return (int) decNum;
        } else {
            return 0;
        }
    }
    public static int Hex2Dec (String inStr){
            double decNum = 0 ;

            for (int strId = 0;strId < inStr.length();strId++){
                if (inStr.charAt(strId) == 97){
                    decNum = decNum + 10*Math.pow(16,inStr.length() - strId - 1);
                }else if (inStr.charAt(strId) == 98){
                    decNum = decNum + 11*Math.pow(16,inStr.length() - strId - 1);
                }else if (inStr.charAt(strId) == 99){
                    decNum = decNum + 12*Math.pow(16,inStr.length() - strId - 1);
                }else if (inStr.charAt(strId) == 100){
                    decNum = decNum + 13*Math.pow(16,inStr.length() - strId - 1);
                }else if (inStr.charAt(strId) == 101){
                    decNum = decNum + 14*Math.pow(16,inStr.length() - strId - 1);
                }else if (inStr.charAt(strId) == 102){
                    decNum = decNum + 15*Math.pow(16,inStr.length() - strId - 1);
                }else {
                    decNum = decNum + (inStr.charAt(strId)-48)*Math.pow(16,inStr.length() - strId - 1);
                }
            }
            return (int) decNum;
    }
    public static int Oct2Dex (int inNum){
        double decNum = 0;
        int pcNum;
        int deviceCount = 0;

        while (inNum > 0){
            pcNum = inNum%10;
            decNum = decNum + pcNum * Math.pow(8,deviceCount);
            deviceCount++;
            inNum/=10;
        }
        return (int)decNum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radixId = in.nextInt();
        System.out.print("Enter the string: ");

        if (radixId == 2 || radixId == 8){
            int inNum = in.nextInt();
            if (radixId == 2){
                System.out.println("The equivalent decimal number " + inNum +" is: " + changeBinToDec(inNum));
            }else {
                System.out.println("The equivalent decimal number " + inNum + " is: " + Oct2Dex(inNum));
            }
        }else {
            String inStr = in.next();
            System.out.println("The equivalent decimal number " + inStr + " is: " + Hex2Dec(inStr));
        }

    }
}
