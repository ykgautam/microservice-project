package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final String genericMessage = "Resource not found on server !!";

    public ResourceNotFoundException(){
        super(genericMessage);
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
