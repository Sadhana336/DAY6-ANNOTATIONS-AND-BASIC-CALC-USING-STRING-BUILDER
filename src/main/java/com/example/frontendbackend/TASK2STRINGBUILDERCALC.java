package com.example.frontendbackend;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class TASK2STRINGBUILDERCALC{

    @GetMapping("/calc1/{type}/{a}/{b}")
    public Map<String, Object> calculate(
            @PathVariable String type,
    @PathVariable double a,
    @PathVariable double b) {

        double result = 0;

        switch (type.toLowerCase()) {
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        StringBuilder operation = new StringBuilder();
        operation.append(type.toUpperCase())
                .append("(")
                .append(a)
                .append(", ")
                .append(b)
                .append(")");

        return Map.of(
                "operation", operation.toString(),
                "result", result
        );
    }
}