import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(-2, 1));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, Calculator.subtract(3, 2));
        assertEquals(-3, Calculator.subtract(-2, 1));
        assertEquals(0, Calculator.subtract(5, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(-6, Calculator.multiply(-2, 3));
        assertEquals(0, Calculator.multiply(5, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.0001);
        assertEquals(-2.0, Calculator.divide(-4, 2), 0.0001);
        assertEquals(0.3333, Calculator.divide(1, 3), 0.0001);
    }
}