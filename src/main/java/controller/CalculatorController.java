package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }
    @GetMapping()
    public String welcome(){
        return "Добро пожаловать";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + "+" + b + "=" + service.plus(a,b);

    }
    @GetMapping("/minus")
    public String mimus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return a + "-" + b + "=" + service.minus(a,b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return a + "*" + b + "=" + service.multiply(a,b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a,@RequestParam("num2") int b){
        try {
            return a + "/" + b + "=" + service.divide(a,b);
        } catch (Exception e){
            return "Делить на ноль нельзя ";
        }

    }
}