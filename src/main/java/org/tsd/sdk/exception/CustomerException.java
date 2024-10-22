package org.tsd.sdk.exception;

public class CustomerException extends Exception {
	
    private static final long serialVersionUID = 1L;

	public CustomerException(String message) {
        super(message);
    }

    public CustomerException(String message, Throwable th) {
        super(message, th);
    }
}
