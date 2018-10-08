
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt();// read the initial value of seconds from the user
                System.out.print("minutes: ");
        int m = reader.nextInt();// read the initial value of minutes from the user
                System.out.print("hours: ");
        int h = reader.nextInt(); // read the initial value of hours from the user

                seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );

            // advance minutes
            seconds.next();

            // if minutes become zero, advance hours
            if(seconds.getValue()==0){minutes.next();}
            // advance minutes
            if(minutes.getValue()==0 && seconds.getValue()==0){hours.next();}

            // if minutes become zero, advance hours

            i++;
        }
    }
}




