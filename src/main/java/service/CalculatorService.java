package service;

import exeprions.DivizionByZero;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivizionByZero();
        }
        return a / b;
    }
}
