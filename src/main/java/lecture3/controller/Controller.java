package lecture3.controller;

import lecture1.model.Calculator;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Controller {
    Calculator calculator = new Calculator();

    @GetMapping("/state")
    public Double getCalculatorState() {
        calculator.plus(5);
        return calculator.getState();
    }
    @PostMapping(value = "/state")
    public void setCalculatorState(@RequestBody HashMap<String, Object> body) {
        calculator.setState(Double.parseDouble(body.get("state").toString()));
        System.out.println(calculator.getState());
    }
}
