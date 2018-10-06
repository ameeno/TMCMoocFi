
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first = reader.nextLine();
        System.out.println("Type in the second word: ");
        String second = reader.nextLine();
        System.out.print("The word '" + second + "' is ");
        if (first.indexOf(second) == -1) {
            System.out.print("not ");
        }
        System.out.print("found in the word '" + first + "'.\n");

    }
}
