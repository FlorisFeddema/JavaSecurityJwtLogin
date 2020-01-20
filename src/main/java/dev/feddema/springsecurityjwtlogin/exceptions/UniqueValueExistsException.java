package dev.feddema.springsecurityjwtlogin.exceptions;

public class UniqueValueExistsException extends Exception {
    public UniqueValueExistsException(String message) {
        super(message);
    }
}
