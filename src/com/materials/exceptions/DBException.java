package com.materials.exceptions;

public class DBException extends Exception {

	public DBException(String message, Throwable t) {
		super(message,t);
	}
	
	public DBException(String message) {
		super(message);
	}
}
