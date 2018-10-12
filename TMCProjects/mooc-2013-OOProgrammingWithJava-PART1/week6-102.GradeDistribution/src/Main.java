import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> entered=new ArrayList<Integer>();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        System.out.println("Type exam scores, -1 completes:");
        int input=scanner.nextInt();
        while(input!=(-1))
        {

            entered.add(input);
            System.out.println();
            input=scanner.nextInt();
        }

        System.out.println("Grade distribution:");

        for(int i=0; i<entered.size(); i++){
        switch(i) {

            case 5 :
                break;
        }

        }

    }

    class Solution {
        public int reverse(int x) {
            String int2String=""+x;
            String reversed="";
            for (int i=0;i<int2String.length(); i++){
                reversed+=int2String.charAt(int2String.length()-i)-1;
            }
            return Integer.parseInt(reversed);
        }
        }
    }

