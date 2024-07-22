package com.example.diexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiExampleApplication.class, args);

		// configuring IoC container (ApplicationContext)
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(DummyPrinter.class);
		applicationContext.register(DummyPrinterManager.class);
		applicationContext.refresh();

		// usage of objects without creating them, just taking them from IoC container (ApplicationContext)
		DummyPrinterManager dummyPrinterManager = applicationContext.getBean(DummyPrinterManager.class);
//		dummyPrinterManager.getPrinter().printDummyMessage();

//		DummyPrinter printer = new DummyPrinter();
//		DummyPrinterManager dummyPrinterManager = new DummyPrinterManager(printer);
		dummyPrinterManager.getPrinter().printDummyMessage();
	}
}
