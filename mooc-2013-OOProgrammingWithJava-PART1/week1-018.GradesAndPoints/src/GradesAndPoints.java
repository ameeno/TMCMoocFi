
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");

        int points = Integer.parseInt(reader.nextLine());
        String output;
        int grade = 0;

        if (points > 29 && points < 35) {
            grade = 1;
        }
        if (points > 34 && points < 40) {
            grade = 2;
        }
        if (points > 39 && points < 45) {
            grade = 3;
        }
        if (points > 44 && points < 50) {
            grade = 4;
        }
        if (points > 49 && points < 61) {
            grade = 5;
        }
        if (points > 60) {
            grade = 6;
        }

        switch (grade) {
            case 1: {
                output = "Grade: 1";
                break;
            }
            case 2: {
                output = "Grade: 2";
                break;
            }
            case 3: {
                output = "Grade: 3";
                break;
            }
            case 4: {
                output = "Grade: 4";
                break;
            }
            case 5: {
                output = "Grade 5";
                break;
            }
            case 6: {
                output = "Maximum score is 60.";
                break;
            }
            default: {
                output = "Failed";
                break;
            }

        }
        System.out.println(output);

    }
}
