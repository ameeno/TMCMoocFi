
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.print("Until What? ");
        int entered = Integer.parseInt(reader.nextLine());

        while (num < entered) {
            num++;
            sum += num;

        }
        System.out.println("Sum is " + sum);
    }

}
