import static org.junit.jupiter.api.Assertions.*;

import org.example.CalculatorLogic;
import org.junit.jupiter.api.Test;

public class CalculatorLogicTest {

    @Test
    public void testAddition() {
        CalculatorLogic calculator = new CalculatorLogic();
        calculator.setNum1(5);
        calculator.setNum2(3);
        calculator.setOperator('+');
        assertEquals(8, calculator.calculate(), 0.0001);
    }
}