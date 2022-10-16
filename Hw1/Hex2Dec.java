import java.util.Scanner;

public class Hex2Dec {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
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
        System.out.println(decNum);
    }
}
