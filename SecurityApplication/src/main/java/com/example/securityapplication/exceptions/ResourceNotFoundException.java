package com.example.securityapplication.exceptions;

public class ResourceNotFoundException extends RuntimeException {

     public ResourceNotFoundException(String message){
         super(message);
     }
}
