import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> Phonebook;

    public Phonebook() {
        Phonebook = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Phonebook.add(new Person(name, number));
    }

    public void printAll() {
        for (Person x : Phonebook) {
            System.out.println(x.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person x : Phonebook) {
            if (x.getName().equals(name)) {
                return x.getNumber();
            }
        }
        return "number not known";
    }
}
