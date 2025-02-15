import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTests {

    @Test
    public void testExample() {
        int expected = 42;
        int actual = 40 + 2;
        assertEquals(expected, actual, "The sum of 40 and 2 should be 42");
    }
}