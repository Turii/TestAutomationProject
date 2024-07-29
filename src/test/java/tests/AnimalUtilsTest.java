package tests;

import com.myproject.AnimalUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalUtilsTest {
    @Test
    public void testSum() {
        System.out.println("Test");
        assertEquals(5, AnimalUtils.sum(2, 3));
        assertEquals(-1, AnimalUtils.sum(-2, 1));
        assertEquals(0, AnimalUtils.sum(0, 0));
    }
    @Test
    public void testIsPositive() {
        assertTrue(AnimalUtils.isPositive(5));
        assertFalse(AnimalUtils.isPositive(-5));
        assertFalse(AnimalUtils.isPositive(0));
    }
}
