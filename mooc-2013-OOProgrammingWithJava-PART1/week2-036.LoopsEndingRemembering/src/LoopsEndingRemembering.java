
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;

        while (true) {
            int entered = Integer.parseInt(reader.nextLine());
            if (entered != -1) {
                sum += entered;
                count++;
                if (entered % 2 == 0) {
                    even++;
                }
// System.out.println(sum);
            } else {
                System.out.println("Thank you and see you later!");
                break;
            }

        }
        System.out.println("The sum is " + sum);
        System.out.println("How many Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + (count - even));

    }
}
