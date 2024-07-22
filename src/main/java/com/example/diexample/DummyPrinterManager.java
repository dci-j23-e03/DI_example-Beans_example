package com.example.diexample;

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
}
