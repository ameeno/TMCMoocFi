
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        System.out.print("Last ");
        int entered = Integer.parseInt(reader.nextLine());

        while (num <= entered) {

            sum += num;
            num++;

        }
        System.out.println("Sum is " + sum);
    }
}
