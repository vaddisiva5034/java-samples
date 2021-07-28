
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator obj = new Calculator();
        int actualresult = obj.add(1, 2);
        assertEquals(3, actualresult);
    }
}
