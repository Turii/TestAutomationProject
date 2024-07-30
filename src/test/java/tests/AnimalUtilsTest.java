package tests;

import com.myproject.AnimalUtils;
import com.myproject.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalUtilsTest {
    @Test
    public void testSum() {
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

    @Test
    public void testfindDogByNamePass() {
        Dog[] dogs = {new Dog("Mario", 10), new Dog("Kasper", 4), new Dog("Bella", 1)};
        int kasperNumber = AnimalUtils.findDogByName("Kasper", dogs);

        assertEquals(1, kasperNumber);
    }

    @Test
    public void testfindDogByNameNotExists() {
        Dog[] dogs = {new Dog("Mario", 10), new Dog("Kasper", 4), new Dog("Bella", 1)};
        int kasperNumber = AnimalUtils.findDogByName("Mmmmm", dogs);

        assertEquals(-1, kasperNumber);
    }

    @Test
    public void testfindDogByNameEmptyArray() {
        Dog[] dogs = {};
        int kasperNumber = AnimalUtils.findDogByName("Kasper", dogs);

        assertEquals(-1, kasperNumber);
    }

    @Test
    public void testfindDogByNameFirstElement() {
        Dog[] dogs = {new Dog("Mario", 10), new Dog("Kasper", 4), new Dog("Bella", 1)};
        int kasperNumber = AnimalUtils.findDogByName("Mario", dogs);

        assertEquals(0, kasperNumber);
    }



}
