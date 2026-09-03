import org.example.NumberComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    void testFirstGreater() {
        assertEquals("Первое число больше второго", NumberComparator.compare(10, 5));
        assertEquals("Первое число больше второго", NumberComparator.compare(0, -1));
    }

    @Test
    void testFirstLess() {
        assertEquals("Первое число меньше второго", NumberComparator.compare(3, 7));
        assertEquals("Первое число меньше второго", NumberComparator.compare(-5, 0));
    }

    @Test
    void testEqual() {
        assertEquals("Числа равны", NumberComparator.compare(5, 5));
        assertEquals("Числа равны", NumberComparator.compare(-3, -3));
        assertEquals("Числа равны", NumberComparator.compare(0, 0));
    }
}