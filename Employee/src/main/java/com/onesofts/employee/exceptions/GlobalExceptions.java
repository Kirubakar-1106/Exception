package com.onesofts.employee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {

	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> NameNotFoundExceptionHandling(NameNotFoundException ne) {
		return new ResponseEntity<>(ne.getMessage(), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(SalaryNotFoundException.class)
	public ResponseEntity<Object> SalaryNotFoundExceptionHandling(SalaryNotFoundException se) {
		return new ResponseEntity<>(se.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(GenderNotFoundException.class)
	public ResponseEntity<Object> GenderNotFoundExceptionHandling(GenderNotFoundException ge){
		return new ResponseEntity<>(ge.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> AgeExceptionHandling(AgeException ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}
}
