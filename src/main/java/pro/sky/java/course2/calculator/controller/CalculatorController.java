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

    @GetMapping()
    public String hello() {
        return calculatorService.getCalculatorHello();
    }

//    @GetMapping("/test")
//    public String test(@RequestParam int num1, @RequestParam int num2) {
//        int result = num1 + num2;
//        return "Сумма: " + result;
//    }

    @GetMapping("/plus")
    public String addition(@RequestParam int num1, @RequestParam int num2) {
        //if (num1 = null) {} пока так и не понял как возвращать ошибку, кроме как ошибку статуса 400
        return num1 + " + " + num2 + " = " + calculatorService.getCalculatorPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getCalculatorMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getCalculatorMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam int num1, @RequestParam int num2) {
        try {
            return num1 + " / " + num2 + " = " + calculatorService.getCalculatorDivide(num1, num2);
        } catch (ArithmeticException exception) {
            return "Деление на ноль невозможно";
        }
    }

}
