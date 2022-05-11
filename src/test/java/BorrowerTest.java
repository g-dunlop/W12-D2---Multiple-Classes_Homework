import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("A Song of Ice and Fire", "George R.R. Martin", "Fantasy");
        borrower = new Borrower("Jeff");
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.getNumberOfBooksInCollection());
    }

    @Test
    public void canTakeBookFromLibrary(){
        library.addBookToStock(book1);
        borrower.takeBookFromLibrary(library, book1);
        assertEquals(1, borrower.getNumberOfBooksInCollection());
        assertEquals(0, library.getNumberOfBooks());
    }

}
