import java.util.ArrayList;

public class Library {

    private Integer capacity;
    private ArrayList<Book> books;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }

    public void addBookToStock(Book book){
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
        else {
            return;
        }
        }

    public Book removeBookFromStock(Book book){
        this.books.remove(book);
        return book;
    }
    }

