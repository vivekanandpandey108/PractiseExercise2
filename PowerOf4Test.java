import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {
    PowerOf4 powerof4;

    @Before
    public void setUp() throws Exception {

        powerof4 = new PowerOf4();

    }

    @After
    public void tearDown() throws Exception {

        powerof4 = null;
    }

    @Test
    public void checker() {

        assertTrue(powerof4.checker(16));

        assertTrue(powerof4.checker(64));

        assertTrue(powerof4.checker(256));

        assertTrue(powerof4.checker(4));

    }

    @Test
    public void checkerFailure(){

        assertFalse(powerof4.checker(7));

        assertFalse(powerof4.checker(12));

        assertFalse(powerof4.checker(22));
    }
}