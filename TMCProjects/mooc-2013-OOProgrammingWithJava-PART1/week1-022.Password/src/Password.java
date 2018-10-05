
import java.util.Scanner;
import org.omg.PortableServer.POAPackage.WrongAdapter;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String pwTry;
        System.out.print("Type the password: ");
        pwTry = reader.nextLine();
        // Write your code here
        while (!pwTry.equals(password)) {
            System.out.print("Wrong!\nType the password: ");
            pwTry = reader.nextLine();
        }
        System.out.println("Right!\nThe secret is: jryy qbar!");

    }
}
