import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random=new Random();
    private int length;
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();



    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length=length;
        }


    public String createPassword() {
        // write code that returns a randomized password
        String pw="";
        for(int i=0; i<length; i++)
        {
            pw+=alphabet[random.nextInt(26)];
        }
        return pw;
    }
}
