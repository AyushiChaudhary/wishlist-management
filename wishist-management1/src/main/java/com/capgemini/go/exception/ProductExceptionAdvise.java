package com.capgemini.go.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ProductExceptionAdvise {
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<String> userExceptionHandler(ProductException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> otherExceptionHandler(Exception ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
