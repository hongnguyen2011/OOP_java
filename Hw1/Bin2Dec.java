import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inNum = in.nextInt();
        double decNum = 0;
        double pcNum ;
        int diviceCount = 0;
        int check = 1;

        while (inNum > 0){
            pcNum = inNum%10;

            if (pcNum != 0 && pcNum != 1) {
                check = 0;
            }

            decNum = decNum + pcNum*Math.pow(2,diviceCount);
            diviceCount++;
            inNum/=10;
        }

        if (check == 1){
            System.out.println(decNum);
        }else {
            System.out.println("error");
        }
    }
}
