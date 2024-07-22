package com.example.diexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

  @PostConstruct
  public void postInit() {
    System.out.println("DummyPrinter bean created!");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("DummyPrinter bean is going to be destroyed");
  }
}
