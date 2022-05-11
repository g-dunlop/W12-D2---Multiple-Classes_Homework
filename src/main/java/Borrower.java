import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public int getNumberOfBooksInCollection(){
        return this.collection.size();
    }

    public void takeBookFromLibrary(Library library, Book book){
        Book book1 = library.removeBookFromStock(book);
        this.collection.add(book);
    }

}
