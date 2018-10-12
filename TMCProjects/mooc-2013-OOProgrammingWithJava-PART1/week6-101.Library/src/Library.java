import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book x : this.library) {
            System.out.println(x);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        return searchBook(title, null, -1);
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        return searchBook(null, publisher, -1);
    }

    public ArrayList<Book> searchByYear(int year) {
        return searchBook(null, null, year);
    }

    // Helper method
    public ArrayList<Book> searchBook(String title, String publisher, int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book x : this.library) {
            if (StringUtils.included(x.title(), title)
                    || StringUtils.included(x.publisher(), publisher)
                    || x.year() == year)
                found.add(x);
        }
        return found;
    }
}
