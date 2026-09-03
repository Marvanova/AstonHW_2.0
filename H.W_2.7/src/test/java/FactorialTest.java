import org.example.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    void testFactorialOfSeven() {
        assertEquals(5040, Factorial.calculateFactorial(7));
    }
}