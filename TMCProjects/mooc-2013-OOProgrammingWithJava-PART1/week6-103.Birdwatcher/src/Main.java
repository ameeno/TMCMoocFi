import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        birds birds1 = new birds();
        while (true) {
            System.out.print("? ");
            String word = birds1.getnext();
            if (word != null) {
                if (word.equals("Add")) {
                    birds1.Add();
                }
                if (word.equals("Quit")) {
                    break;
                }
                if (word.equals("Observation")) {
                    birds1.observe();

                }
                if (word.equals("Statistics")) {
                    birds1.statistics();
                }
                if (word.equals("Show")) {
                    birds1.show();
                }
            }
        }
    }

}

