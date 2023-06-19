package service;

import exeprions.DivizionByZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusPositive() {
        assertEquals(10, calculatorService.plus(3, 7));
    }

    @Test
    public void plusNegative() {
        assertEquals(-10, calculatorService.plus(-3, -7));
    }

    @Test
    public void plusSymmetry() {
        assertEquals(calculatorService.plus(3, 7), calculatorService.plus(7, 3));
    }

    @Test
    public void minusPositive() {
        assertEquals(10, calculatorService.minus(13, 3));
    }

    @Test
    public void minusNegative() {
        assertEquals(-10, calculatorService.minus(-13, -3));
    }

    @Test
    public void multiplyPositive() {
        assertEquals(10, calculatorService.multiply(2, 5));
    }

    @Test
    public void multiplyNegative() {
        assertEquals(-10, calculatorService.multiply(-2, 5));
    }

    @Test
    public void dividePositive() throws Exception {
        assertEquals(10, calculatorService.divide(20, 2));
    }

    @Test
    public void divideNegative() throws Exception {
        assertEquals(-10, calculatorService.divide(-20, 2));
    }

    @Test
    public void divizionByZero() {
        assertThrows(DivizionByZero.class, () -> {
            calculatorService.divide(10, 0);
        });
    }
}