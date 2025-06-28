import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        calc.add(5);
        assertEquals(5, calc.getResult());
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        calc.add(10);
        calc.subtract(4);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        calc.add(3);
        calc.multiply(4);
        assertEquals(12, calc.getResult());
    }

    @Test
    public void testExponentiation() {
        Calculator calc = new Calculator();
        calc.add(2);
        calc.exponent(3); 
        assertEquals(8, calc.getResult());
    }

    @Test
    public void testReset() {
        Calculator calc = new Calculator();
        calc.add(10);
        calc.reset();
        assertEquals(0, calc.getResult());
    }

    @Test
    public void testExponentZero() {
        Calculator calc = new Calculator();
        calc.add(5);
        calc.exponent(0); 
        assertEquals(1, calc.getResult());
    }
}
