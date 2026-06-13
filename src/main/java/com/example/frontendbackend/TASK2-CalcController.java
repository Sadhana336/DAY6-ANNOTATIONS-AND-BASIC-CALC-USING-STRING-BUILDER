package com.example.frontendbackend;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
//METHOD1:WITHOUT JSON
//public class CalcController {
//
//    @GetMapping("/calc/{type}/{a}/{b}")
//    public double calculate(
//            @PathVariable String type,
//            @PathVariable double a,
//            @PathVariable double b) {
//
//        switch (type.toLowerCase()) {
//
//            case "add":
//                return a + b;
//
//            case "sub":
//                return a - b;
//
//            case "mul":
//                return a * b;
//
//            case "div":
//                return a / b;
//
//            case "sqrt":
//                return Math.round(Math.sqrt(a) * 100.0) / 100.0;
//
//            case "square":
//                return Math.pow(a, 2);
//
//            case "sin":
//                return Math.round(Math.sin(a) * 100.0) / 100.0;
//
//            case "log":
//                return Math.round(Math.log10(a) * 100.0) / 100.0;
//
//            case "round":
//                return Math.round(a);
//
//            default:
//                throw new IllegalArgumentException("Invalid operation");
//        }
//    }
//}
//METHOD2:BACKEND WITH JSON
public class CalcController {//JSON FORMAT

    @GetMapping("/calc/{type}/{a}/{b}")
    public Map<String,Object> calculate(
            // Map.of() creates a JSON response automatically.
            // Spring Boot converts this Map into JSON format.
            // Here it returns:
            // {
            //   "operation": "addition",
            //   "result": a + b
            // }
            @PathVariable String type,
            @PathVariable double a,
            @PathVariable double b){
          return Map.of("operation","addition","result",a+b);
            }
}