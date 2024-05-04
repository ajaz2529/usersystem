package com.userservice.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException() {
        super("user not found");
    }
    public UserNotFoundException(String mess) {
        super(mess);
    }

}
