package dev.feddema.springsecurityjwtlogin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UniqueValueExistsExceptionControllerAdvice {
    @ResponseBody
    @ExceptionHandler(UniqueValueExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String exceptionHandler(UniqueValueExistsException ex) {
        return ex.getMessage();
    }
}
