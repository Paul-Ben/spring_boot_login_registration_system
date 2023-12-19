package com.app.log_reg.exceptions;

public class UserAlreadyExistsException extends RuntimeException{
    // public static final String EXCEPTION = "User with this email already exists";
    public UserAlreadyExistsException(String message){
        super(message);
    }
}
