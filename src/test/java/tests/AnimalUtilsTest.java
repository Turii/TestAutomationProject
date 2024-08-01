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



    @Test
    public void testBinarySearchElementPresent() {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int expectedIndex = 3;
        int result = AnimalUtils.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    @Test
    public void testBinarySearchElementNotPresent() {
        int[] array = {2, 3, 4, 10, 40};
        int target = 5;
        int expectedIndex = -1;
        int result = AnimalUtils.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int target = 1;
        int expectedIndex = -1;
        int result = AnimalUtils.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    @Test
    public void testBinarySearchFirstElement() {
        int[] array = {2, 3, 4, 10, 40};
        int target = 2;
        int expectedIndex = 0;
        int result = AnimalUtils.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    @Test
    public void testBinarySearchLastElement() {
        int[] array = {2, 3, 4, 10, 40};
        int target = 40;
        int expectedIndex = 4;
        int result = AnimalUtils.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }

}
