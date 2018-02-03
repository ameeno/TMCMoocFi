
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here
        int num = 1;
        System.out.print("Up to what Number: ");
        int entered = Integer.parseInt(reader.nextLine());

        while (num <= entered) {
            System.out.println(num);
            num++;
        }
    }
}
