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
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book x : this.library) {
            if(

                    StringUtils.included(x.title(), title)) {
                result.add(x);
            }
        }

        return result;

    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> result = new ArrayList<Book>();


        for (Book x : this.library) {
            if(StringUtils.included(x.publisher(), publisher)){
                result.add(x);
            }
        }

        return result;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book x : this.library) {
            if (x.year() == year) {
                result.add(x);
            }
        }
        return result;
    }

}
