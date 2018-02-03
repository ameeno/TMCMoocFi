
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //System.out.print("First ");
        int num = 1;//Integer.parseInt(reader.nextLine());
        int sum = 1;
        System.out.print("Type a number ");
        int entered = Integer.parseInt(reader.nextLine());

        while (num <= entered) {
            sum *= num;
            num++;
        }
        System.out.println("Factorial is " + sum);
    }
}
