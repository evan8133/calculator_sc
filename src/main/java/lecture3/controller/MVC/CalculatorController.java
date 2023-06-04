package lecture3.controller.MVC;

import lecture1.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    Calculator calculator = new Calculator();

    @GetMapping("/calculator")
    public String calculator(Model model) {
        model.addAttribute("result", calculator.getState());
        return "calculator";
    }

    @PostMapping(value = "/calculator", params = "action=plus")
    public String plus(@RequestParam(value = "numberToProcess") String numberToProcess, Model model) {
        calculator.plus(Double.parseDouble(numberToProcess));
        model.addAttribute("result", calculator.getState());
        return "calculator";
    }

    @PostMapping(value = "/calculator", params = "action=minus")
    public String minus(@RequestParam(value = "numberToProcess") String numberToProcess, Model model) {
        calculator.minus(Double.parseDouble(numberToProcess));
        model.addAttribute("result", calculator.getState());
        return "calculator";
    }
}
