package com.example.exceptions;

public class RoomNotFoundException extends RuntimeException {
	public RoomNotFoundException(
				String message) {
		super(message);
	}
}
