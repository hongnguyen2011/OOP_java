import java.util.Scanner;
public class NumberGuess {
    public static void guessScrectNumber(int secretNumber){
        Scanner in = new Scanner(System.in);
        System.out.println("Key in your guess : ");
        int number = in.nextInt();
        int count = 1;
        while (number != secretNumber) {
            if (number < secretNumber) {
                System.out.println("Try higher");
                number = in.nextInt();
            }
            if (number > secretNumber) {
                System.out.println("Try lower");
                number = in.nextInt();
            }
            count++;
        }
        System.out.print("You got it in " + count + " trials !");
        in.close();
    }
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100);
//        System.out.println(secretNumber);
        guessScrectNumber(secretNumber);

    }
}
