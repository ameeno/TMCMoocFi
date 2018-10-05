
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//System.out.print("First ");

        System.out.print("Type a number ");
        int entered = Integer.parseInt(reader.nextLine());

        int num = 1;//Integer.parseInt(reader.nextLine());
        int result = 0;
        while (num <= entered) {
            num++;
            result = (int) Math.pow(2, num);
        }

        System.out.println("The result is " + (result - 1));
    }
}
