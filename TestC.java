import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestC {
    @Test
    public void testAdd() {
        TestJunit unit = new TestJunit();
        assertEquals(3, unit.add(1, 2));
    }

    @Test
    public void testAddwithThreeNumbers() {
        TestJunit unit = new TestJunit();
        assertEquals(6, unit.add(1, 2, 3));
    }

    @Test
    public void testAddWithArray() {
        TestJunit unit = new TestJunit();
        assertEquals(6, unit.add(new int[] { 1, 2, 3 }));
    }
}
