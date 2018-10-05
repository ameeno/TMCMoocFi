
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
       // System.out.println("Welcome to the Ameeno Adder! \n");
        System.out.print("Your first number: ");
        int a = Integer.parseInt(reader.nextLine());   // First Int to Integer A

        System.out.print("And your Second Number: ");
        int b = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

        System.out.println("Sum of the numbers: " + (a + b));
    }
}
