package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiseImpl implements CalculatorService {

    @Override
    public int Plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int Minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int Divide(int num1, int num2) {
        return num1 / num2;
    }
}
