import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();


    @Test
    public void canAdd() {
        assertEquals(10, calculator.add(2, 8));
    }

    @Test
    public void canSubtract() {
        assertEquals(20, calculator.subtract(30, 10));
    }

    @Test
    public void canMultiply() {
        assertEquals(36, calculator.mulitply(6, 6));
    }

    @Test
    public void canDivide(){
        assertEquals(4.5, calculator.divide(9, 2), 0.0);
    }


}
