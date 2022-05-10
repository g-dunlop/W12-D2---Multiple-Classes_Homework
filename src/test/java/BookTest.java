import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book ("A Song of Ice and Fire", "George R.R. Martin", "Fantasy");
    }

    @Test
    public void hasName(){
        assertEquals("A Song of Ice and Fire", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("George R.R. Martin", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }
}
