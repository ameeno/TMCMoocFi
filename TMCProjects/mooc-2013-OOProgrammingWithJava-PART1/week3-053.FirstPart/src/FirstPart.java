
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name= reader.nextLine();
        System.out.println("Length of the first part: ");
        int len = reader.nextInt();
            System.out.print("Result: "+name.substring(0,len));

    }

                        }
