package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String addition(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.Plus(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.Minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.Multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam int num1, @RequestParam int num2) {
        try {
            return num1 + " / " + num2 + " = " + calculatorService.Divide(num1, num2);
        } catch (ArithmeticException exception) {
            return "Деление на ноль невозможно";
        }
    }

}
