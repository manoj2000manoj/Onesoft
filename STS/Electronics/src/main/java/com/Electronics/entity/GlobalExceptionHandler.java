package com.Electronics.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Electronics.Exception.BrandNotFoundException;
import com.Electronics.Exception.ModelNotFoundException;
import com.Electronics.Exception.PriceNotFoundException;
import com.Electronics.Exception.StorageNotFoundException;
import com.Electronics.Exception.YearNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<Object> brandNotMatch(BrandNotFoundException be) {
		return new ResponseEntity<>(be.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ModelNotFoundException.class)
	public ResponseEntity<Object> modelNotMatch(ModelNotFoundException me) {
		return new ResponseEntity<>(me.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(StorageNotFoundException.class)
	public ResponseEntity<Object> storageNotMatch(StorageNotFoundException se) {
		return new ResponseEntity<>(se.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(YearNotFoundException.class)
	public ResponseEntity<Object> yearNotMatch(YearNotFoundException be) {
		return new ResponseEntity<>(be.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object> priceNotMatch(PriceNotFoundException be) {
		return new ResponseEntity<>(be.getMessage(), HttpStatus.NOT_FOUND);
	}

}
