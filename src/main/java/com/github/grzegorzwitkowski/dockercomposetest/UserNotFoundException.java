package com.github.grzegorzwitkowski.dockercomposetest;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(code = NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(int id) {
        super("User with id: " + id + " was not found.");
    }
}
