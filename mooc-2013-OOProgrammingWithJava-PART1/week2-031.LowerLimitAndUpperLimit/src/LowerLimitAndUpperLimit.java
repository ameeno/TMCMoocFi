
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int entered = Integer.parseInt(reader.nextLine());

        while (num <= entered) {
            System.out.println(num);
            num++;
        }

    }
}
