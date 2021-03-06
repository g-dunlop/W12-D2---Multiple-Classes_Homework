import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("A Song of Ice and Fire", "George R.R. Martin", "Fantasy");
    }

    @Test
    public void checkBookListEmpty(){
       assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBookToStock(){
        library.addBookToStock(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.addBookToStock(book1);
        library.removeBookFromStock(book1);
        assertEquals(0, library.getNumberOfBooks());
    }

}
