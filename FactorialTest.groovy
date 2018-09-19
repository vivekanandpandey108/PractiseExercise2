import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial factorialObj;
    @Before
    public void setUp() throws Exception {

        factorialObj = new Factorial();
    }

    @After
    public void tearDown() throws Exception {

        factorialObj = null;
    }

    @Test
    public void getFactorial() {

        assertEquals(120,factorialObj.getFactorial(5));

    }