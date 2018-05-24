package com.ms3.range.convert.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RangeConversionExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> handleConstraintViolation(
			ConstraintViolationException ex) {
		ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Bad Request");
        response.setErrorMessage(ex.getMessage());
	    return new ResponseEntity<Object>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
}
