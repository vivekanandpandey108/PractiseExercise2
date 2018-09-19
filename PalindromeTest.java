import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {
        palindrome=null;
    }

    @Test
    public void checker()
    {
        assertTrue(palindrome.checker("asdsa"));

//        assertTrue(palindrome.checker("naman"));
//
//        assertTrue(palindrome.checker("qwewq"));
//
//        assertTrue(palindrome.checker("papapap"));
//
//        assertTrue(palindrome.checker("dauduad"));
    }

    @Test
    public void checkerFailure()
    {
        assertFalse(palindrome.checker("asdfg"));

        assertFalse(palindrome.checker("qwertyu"));

        assertFalse(palindrome.checker("asdfgh"));

        assertFalse(palindrome.checker("asdfghjk"));

        assertFalse(palindrome.checker("asnvnvjf"));
    }
}