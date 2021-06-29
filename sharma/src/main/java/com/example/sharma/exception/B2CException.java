package com.example.sharma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * 
 * We can make use of @ControllerAdvice Annotation to handle the Business exception in SpringBoot Globally
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class B2CException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public B2CException(String message)
	{
		super(message);
	}

}
