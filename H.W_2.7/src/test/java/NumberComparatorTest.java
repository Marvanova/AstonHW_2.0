import org.example.NumberComparator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NumberComparatorTest {

    @Test
    public void testFirstGreater() {
        assertEquals(NumberComparator.compare(10, 5), "Первое число больше второго");
        assertEquals(NumberComparator.compare(0, -1), "Первое число больше второго");
    }

    @Test
    public void testFirstLess() {
        assertEquals(NumberComparator.compare(3, 7), "Первое число меньше второго");
        assertEquals(NumberComparator.compare(-5, 0), "Первое число меньше второго");
    }

    @Test
    public void testEqual() {
        assertEquals(NumberComparator.compare(5, 5), "Числа равны");
        assertEquals(NumberComparator.compare(-3, -3), "Числа равны");
        assertEquals(NumberComparator.compare(0, 0), "Числа равны");
    }
}