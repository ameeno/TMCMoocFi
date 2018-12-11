import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> entered = new ArrayList<Integer>();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        System.out.println("Type exam scores, -1 completes:");
        int input = scanner.nextInt();
        while (input != (-1)) {

            entered.add(input);
            System.out.println();
            input = scanner.nextInt();
        }

        System.out.println("Grade distribution:");
        String Zero="0: ",One="1: ",Two="2: ",Three="3: ",Four="4: ",Five="5: ";
        int accepted=0;
        int rejected=0;
        for (int i = 0; i < entered.size(); i++) {
            int grade = number(entered.get(i));

            switch (grade) {
                case 0: {
                    Zero+="*";
                    break;
                }
                case 1: {
                    One+="*";
                    accepted++;
                    break;
                }
                case 2:{
                    Two+="*";
                    accepted++;
                    break;}

                case 3: {
                    Three+="*";
                    accepted++;
                    break;
                }
                case 4: {
                    Four+="*";
                    accepted++;
                    break;
                }
                case 5: {
                    Five+="*";
                    accepted++;
                    break;
                }
                //case 6: {
                  //  One+="*";
                    //accepted++;
                    //break;
               // }
                default: {
                    rejected++;
                    break;
                }
/*
5: **
4:
3: ***
2: *
1: *
0: *
Acceptance percentage: 87.5  100*accepted/entered.size().
 */
            }

        }

        System.out.println(Five+"\n"+Four+"\n"+Three+"\n"+Two+"\n"+One+"\n"+Zero+"\n"+"Acceptance percentage: "+100.0*accepted/(entered.size()-rejected)+"%");
    }

    public static int number(int points) {
        if (points <0 || points>60){
            return -1;
        }
        if (points > 0 && points <30) {
            return 0;}
        if (points > 29 && points < 35) {
            return 1;
        } else if (points > 34 && points < 40) {
            return 2;
        } else if (points > 39 && points < 45) {
            return 3;
        } else if (points > 44 && points < 50) {
            return 4;
        } else if (points > 49 && points < 61) {
            return 5;}
        else{
        return -1;}
    }

    class Solution {
        public int reverse(int x) {
            String int2String = "" + x;
            String reversed = "";
            for (int i = 0; i < int2String.length(); i++) {
                reversed += int2String.charAt(int2String.length() - i) - 1;
            }
            return Integer.parseInt(reversed);
        }
    }

}


