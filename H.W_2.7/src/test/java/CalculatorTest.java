import org.example.Calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(Calculator.add(2, 3), 5);
        assertEquals(Calculator.add(-2, 1), -1);
        assertEquals(Calculator.add(0, 0), 0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(Calculator.subtract(3, 2), 1);
        assertEquals(Calculator.subtract(-2, 1), -3);
        assertEquals(Calculator.subtract(5, 5), 0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(Calculator.multiply(2, 3), 6);
        assertEquals(Calculator.multiply(-2, 3), -6);
        assertEquals(Calculator.multiply(5, 0), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(Calculator.divide(5, 2), 2.5, 0.0001);
        assertEquals(Calculator.divide(-4, 2), -2.0, 0.0001);
        assertEquals(Calculator.divide(1, 3), 0.3333, 0.0001);
    }
}