package com.library.controller;

import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RequestNotFoundException extends Exception{
    public RequestNotFoundException() {
        super("NO DATA IN DATABASE");
    }
}
