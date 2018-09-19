import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenCheckerTest {
EvenChecker evenChecker;

    @Before
    public void setUp() throws Exception {
        evenChecker = new EvenChecker();
        System.out.println("inside before");
    }
    @BeforeClass
    public static void setUp2() throws Exception {
        System.out.println("inside before class");
    }

    @After
    public void tearDown() throws Exception {
        evenChecker = null;
        System.out.println("inside after");
    }

    @Test
    public void checker() {
        //boolean expected = true;
        boolean result = evenChecker.checker(6);
        assertTrue(result);

        boolean result1 = evenChecker.checker(8);
        assertTrue(result1);

        boolean result2 = evenChecker.checker(10);
        assertTrue(result2);

    }
    @Test
    public void checkerFailure() {
        boolean result = evenChecker.checker(7);
        assertFalse(result);
    }



}
