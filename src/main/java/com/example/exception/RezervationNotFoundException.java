package com.example.exception;

public class RezervationNotFoundException extends RuntimeException {
  public RezervationNotFoundException(String message) {
    super(message);
  }
}
