package com.company;

public class IncorrectINNException extends Exception{
    public IncorrectINNException() {
        super();
    }

    public IncorrectINNException(String message) {
        super(message);
    }

    public IncorrectINNException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectINNException(Throwable cause) {
        super(cause);
    }

    protected IncorrectINNException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
