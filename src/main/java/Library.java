import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }


}
