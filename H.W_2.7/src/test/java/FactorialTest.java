import org.example.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.calculateFactorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(Factorial.calculateFactorial(1), 1);
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(Factorial.calculateFactorial(5), 120);
    }

    @Test
    public void testFactorialOfSeven() {
        assertEquals(Factorial.calculateFactorial(7), 5040);
    }
}