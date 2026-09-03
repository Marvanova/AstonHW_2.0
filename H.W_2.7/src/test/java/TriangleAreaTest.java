import org.example.TriangleArea;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TriangleAreaTest {

    @Test
    public void testAreaWithBaseAndHeight() {
        assertEquals(TriangleArea.calculateArea(5, 4), 10.0, 0.0001);
    }

    @Test
    public void testAreaWithDecimalNumbers() {
        assertEquals(TriangleArea.calculateArea(3.0, 5.0), 7.5, 0.0001);
    }

    @Test
    public void testAreaWithSmallNumbers() {
        assertEquals(TriangleArea.calculateArea(1, 1), 0.5, 0.0001);
    }

    @Test
    public void testAreaWithLargeNumbers() {
        assertEquals(TriangleArea.calculateArea(100, 50), 2500.0, 0.0001);
    }

    @Test
    public void testAreaWithZeroBase() {
        assertEquals(TriangleArea.calculateArea(0, 10), 0.0, 0.0001);
    }

    @Test
    public void testAreaWithZeroHeight() {
        assertEquals(TriangleArea.calculateArea(10, 0), 0.0, 0.0001);
    }
}