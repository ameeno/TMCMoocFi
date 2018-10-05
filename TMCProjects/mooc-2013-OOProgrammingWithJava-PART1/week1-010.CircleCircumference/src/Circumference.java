
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        double Pi = Math.PI;
        System.out.println("Type the radius: ");
        double input = Integer.parseInt(reader.next());

        System.out.println("Circumference of the circle: " + (2 * (Math.PI * input)));

    }
}
