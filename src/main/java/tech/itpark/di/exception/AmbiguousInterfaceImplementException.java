package tech.itpark.di.exception;

public class AmbiguousInterfaceImplementException extends DException {
    public AmbiguousInterfaceImplementException() {
    }

    public AmbiguousInterfaceImplementException(String message) {
        super(message);
    }

    public AmbiguousInterfaceImplementException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmbiguousInterfaceImplementException(Throwable cause) {
        super(cause);
    }

    protected AmbiguousInterfaceImplementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
