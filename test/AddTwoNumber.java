import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        // Create mock instance of Calculator
        Calculator calculator = mock(Calculator.class);

        // Define behavior for the add method
        when(calculator.add(5, 3)).thenReturn(8);

        // Call the add method and assert the result
        int result = calculator.add(5, 3);
        assertEquals(8, result);

        // Verify that the add method was called with the expected arguments
        verify(calculator).add(5, 3);
    }