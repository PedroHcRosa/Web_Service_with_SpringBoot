package com.pedrorosa.course.resources.exeception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pedrorosa.course.Services.exeception.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExeceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> ResourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		
			String error = "Resource not found";
			HttpStatus status = HttpStatus.NOT_FOUND;
			StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
			return ResponseEntity.status(status).body(err);
	}
	
	
}
