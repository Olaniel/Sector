package by.epam.tr.start;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InsideSectorTest {

    @Test
    public void checkIfPointInSector_shouldBeInSector() {

        Solution solution = new Solution();
        assertTrue("Veriry results is true", solution.insideSector(-2, 4));
        assertTrue("Veriry results is true", solution.insideSector(2, 4));
        assertTrue("Veriry results is true", solution.insideSector(-4, -3));
        assertTrue("Veriry results is true", solution.insideSector(4, -3));
    }
    @Test
    public void checkIfPointInSector_shouldBeOutSector() {

        Solution solution = new Solution();
        assertFalse("Veriry results is true", solution.insideSector(-3, 4));
        assertFalse("Veriry results is true", solution.insideSector(-5, -4));
        assertFalse("Veriry results is true", solution.insideSector(3, 4));
        assertFalse("Veriry results is true", solution.insideSector(5, 4));
    }

}