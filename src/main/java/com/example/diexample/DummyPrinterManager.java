package com.example.diexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyPrinterManager {

  private DummyPrinter printer;

  public DummyPrinterManager() {
  }

  @Autowired
  public DummyPrinterManager(DummyPrinter printer) {
    this.printer = printer;
  }

  public DummyPrinter getPrinter() {
    return printer;
  }

  @PostConstruct
  public void postInit() {
    System.out.println("DummyPrinterManager bean created!");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("DummyPrinterManager bean is going to be destroyed");
  }
}
