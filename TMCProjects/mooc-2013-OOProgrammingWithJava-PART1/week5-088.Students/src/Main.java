
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();


            if (name.isEmpty()) {
                break;
            }

            System.out.print("\nstudentnumber: ");
            String num = reader.nextLine();

            Student s = new Student(name, num); list.add(s);

        }

        for (Student x : list) {
            System.out.println(x);
        }

        while (true) {
            System.out.print("Give search term: ");
            String search = reader.nextLine();
            ArrayList<Student> result = new ArrayList<Student>();

            for (Student x : list) {
                if (x.getName().contains(search)) {
                    result.add(x);
                }
            }
            System.out.println("Result:");
            for (Student x : result) {
                System.out.println(x);
            }
        }
    }
}

