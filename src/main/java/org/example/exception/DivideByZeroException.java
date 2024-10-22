package org.example.exception;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("Divide by zero not allowed");
    }

    public DivideByZeroException(String message) {
        super(message);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZeroException(Throwable cause) {
        super(cause);
    }
}
