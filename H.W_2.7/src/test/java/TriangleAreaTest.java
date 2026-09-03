import org.example.TriangleArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    void testAreaWithBaseAndHeight() {
        assertEquals(10.0, TriangleArea.calculateArea(5, 4), 0.0001);
    }

    @Test
    void testAreaWithDecimalNumbers() {
        assertEquals(7.5, TriangleArea.calculateArea(3.0, 5.0), 0.0001);
    }

    @Test
    void testAreaWithSmallNumbers() {
        assertEquals(0.5, TriangleArea.calculateArea(1, 1), 0.0001);
    }

    @Test
    void testAreaWithLargeNumbers() {
        assertEquals(2500.0, TriangleArea.calculateArea(100, 50), 0.0001);
    }

    @Test
    void testAreaWithZeroBase() {
        assertEquals(0.0, TriangleArea.calculateArea(0, 10), 0.0001);
    }

    @Test
    void testAreaWithZeroHeight() {
        assertEquals(0.0, TriangleArea.calculateArea(10, 0), 0.0001);
    }
}