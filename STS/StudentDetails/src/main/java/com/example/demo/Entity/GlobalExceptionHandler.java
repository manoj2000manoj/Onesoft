package com.example.demo.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Exception.AgeNotFoundException;
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object>AgeNotMatch(AgeNotFoundException ae) {
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}

}
