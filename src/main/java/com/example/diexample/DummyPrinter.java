package com.example.diexample;

import org.springframework.stereotype.Component;

@Component
public class DummyPrinter {
  private String message = "Hello everybody!";

  public void printDummyMessage() {
    System.out.println(message);
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
