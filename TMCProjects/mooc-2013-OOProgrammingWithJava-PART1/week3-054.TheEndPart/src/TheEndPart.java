import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name= reader.nextLine();
        System.out.println("Length of the end part: ");
        int len = reader.nextInt();
        System.out.print("Result: "+name.substring((name.length())-len,name.length()));
    }
}
