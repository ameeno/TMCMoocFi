import java.util.ArrayList;
import java.util.Scanner;

public class birds {
    private Scanner reader;
    private ArrayList<bird> birds;

    public birds() {
        this.birds = new ArrayList<bird>();
        reader = new Scanner(System.in);
    }

    public void Add() {

        System.out.print("Name: ");
        String name = getnext();
        if (findBird(name) == null) {
            System.out.print("Latin Name: ");
            String Latin = getnext();
            birds.add(new bird(name, Latin));
        }
    }

    public void observe() {
        System.out.print("What was observed? ");
        String name = getnext();
        if (name != null && findBird(name) != null) {
            findBird(name).observe();
        }
    }


    public bird findBird(String name) {
        for (bird x : birds) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return null;
    }

    public void statistics() {
        for (bird x : birds) {
            System.out.println(x.toString() + "\n");
        }
    }

    public void show() {
        System.out.print("What? ");
        String name = getnext();
        if (name != null && findBird(name) != null) {
            System.out.println(findBird(name) + "\n");
        }
    }

    public String getnext() {
        return reader.nextLine();
    }
}
