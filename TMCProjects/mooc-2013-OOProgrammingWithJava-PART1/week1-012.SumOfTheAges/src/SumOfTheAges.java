
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");

        String person1 = reader.nextLine();
        System.out.print("Type your age: ");

        int person1Age = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");

        String person2 = reader.nextLine();
        System.out.print("Type your age: ");

        int person2Age = Integer.parseInt(reader.nextLine());

        System.out.print("\n" + person1 + " and " + person2 + " are " + (person1Age + person2Age) + " years old in total.");

    }
}
