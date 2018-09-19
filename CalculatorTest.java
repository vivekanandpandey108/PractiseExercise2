//import org.junit.After;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class CalculatorTest {
//    Calculator calculator;
//
//    @Before
//    public void setUp() throws Exception {
//        calculator = new Calculator();
//        System.out.println("inside before");
//    }
//    @BeforeClass
//    public static void setUp2() throws Exception {
//        System.out.println("inside before class");
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        calculator = null;
//        System.out.println("inside after");
//    }
//
//    @Test
//    public void add() {
//        //arrange
//        int expected = 6;
//        //act
//        int result=calculator.add(2,4);
//        //assert
//        assertEquals(expected, result);
//
//    }
//    @Test
//    public void sub() {
//        //arrange
//        int expected = 2;
//        //act
//
//
//        int result=calculator.sub(4,2);
//        //assert
//        assertEquals(expected, result);
//
//    }
//}