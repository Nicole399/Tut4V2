package Tut4v2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void appTest()
    {
        assertTrue(Calc.add(2, 2) == 4);
//	assertTrue(Calc.subtract(2, 2) == 0);
    }


}