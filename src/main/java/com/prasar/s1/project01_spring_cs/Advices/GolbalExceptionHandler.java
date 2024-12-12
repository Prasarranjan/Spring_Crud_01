package com.prasar.s1.project01_spring_cs.Advices;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GolbalExceptionHandler {
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
        return new ResponseEntity<>("Resource Not Found", HttpStatus.NOT_FOUND);
    }
}
