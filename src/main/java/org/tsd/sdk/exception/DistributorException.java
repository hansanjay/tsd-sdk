package org.tsd.sdk.exception;

public class DistributorException extends Exception {
	
    private static final long serialVersionUID = 1L;

	public DistributorException(String message) {
        super(message);
    }

    public DistributorException(String message, Throwable th) {
        super(message, th);
    }
}
