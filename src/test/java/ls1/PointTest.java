package ls1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void testOneEqualsData() {
        Point a = new Point(1, 2);
        Point b = new Point(1, 2);
        assertEquals(a, b);
    }
    @Test
    void testOneNoEqualsData() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 1);
        assertNotEquals(a, b);
    }

}