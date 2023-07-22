package com.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {

	@ExceptionHandler(value = AppExceptions.class)
	public ResponseEntity<CommonException> exception (AppExceptions exception)
	{
		CommonException exp=new CommonException();
		
		
		return new ResponseEntity<CommonException>(exp,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
