import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while(numbers.size()<7){
            Random random = new Random();
            int i=random.nextInt(39)+1;
            if(!this.containsNumber(i)){
                numbers.add(i);
            }
        }
        Collections.sort(numbers);
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if ((numbers.contains(number))) return true;
        return false;
    }
}
