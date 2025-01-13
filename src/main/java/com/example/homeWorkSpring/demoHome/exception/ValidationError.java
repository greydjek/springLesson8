package com.example.homeWorkSpring.demoHome.exception;

import com.example.homeWorkSpring.demoHome.productValidator.ProductValidator;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Data
public class ValidationError extends RuntimeException {
List<String> list = new ArrayList<>();
    public ValidationError(List<String> listError){
        super(listError.stream().collect(Collectors.joining(", ")));
        list = listError;
    }
}
