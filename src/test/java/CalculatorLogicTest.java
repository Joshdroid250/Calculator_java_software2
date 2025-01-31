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

    @Test
    public void testDivision() {
        CalculatorLogic calculator = new CalculatorLogic();
        calculator.setNum1(10);
        calculator.setNum2(2);
        calculator.setOperator('/');
        assertEquals(5, calculator.calculate(), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        CalculatorLogic calculator = new CalculatorLogic();
        calculator.setNum1(10);
        calculator.setNum2(0);
        calculator.setOperator('/');
        assertThrows(ArithmeticException.class, () -> calculator.calculate(), "Division by zero should throw an exception");
    }

    @Test
    public void testSubtraction() {
        CalculatorLogic calculator = new CalculatorLogic();
        calculator.setNum1(10);
        calculator.setNum2(4);
        calculator.setOperator('-');
        assertEquals(6, calculator.calculate(), 0.0001);
    }

    @Test
    public void testNegate() {
        CalculatorLogic calculator = new CalculatorLogic();
        assertEquals(-5, calculator.negate(5), 0.0001);
        assertEquals(7, calculator.negate(-7), 0.0001);
    }
}

