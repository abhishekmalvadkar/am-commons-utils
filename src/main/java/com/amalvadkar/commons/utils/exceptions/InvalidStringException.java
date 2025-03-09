package com.amalvadkar.commons.utils.exceptions;

/**
 * Custom exception for invalid string operations.
 */
public class InvalidStringException extends RuntimeException {
    public InvalidStringException(String message) {
        super(message);
    }
}