package com.digitalbooks.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.digitalbooks.Exception.AuthorException;
import com.digitalbooks.entity.ErrorMessage;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(AuthorException.class)
	public ResponseEntity<ErrorMessage> handleAuthorException(AuthorException exc)
	{
		return new ResponseEntity<ErrorMessage>(new ErrorMessage(
				"AuthorException:" +exc.getMessage(),
				exc.getClass().toString(),
				"Exception has occured,Please check"),HttpStatus.OK);

	}
}
