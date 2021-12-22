package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiseImpl implements CalculatorService {
    @Override
    public String getCalculatorHello() {
        return "<b>Hello, user!</b>";
    }

    @Override
    public int getCalculatorPlus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int getCalculatorMinus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int getCalculatorMultiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public int getCalculatorDivide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
