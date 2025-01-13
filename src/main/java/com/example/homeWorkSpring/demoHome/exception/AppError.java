package com.example.homeWorkSpring.demoHome.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppError {
    public int statusError;
    String messageError;
}
