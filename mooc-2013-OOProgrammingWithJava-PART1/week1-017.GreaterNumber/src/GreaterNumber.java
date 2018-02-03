
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type first Number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Type second Number: ");

        int b = Integer.parseInt(reader.nextLine());

        if (a != b) {
            System.out.println("Greater Number: " + Math.max(a, b));
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
