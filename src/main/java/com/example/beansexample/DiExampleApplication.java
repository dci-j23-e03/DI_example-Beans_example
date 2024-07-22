package com.example.beansexample;

import com.example.beansexample.DummyPrinter;
import com.example.beansexample.DummyPrinterManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiExampleApplication.class, args);

		// configuring IoC container (ApplicationContext)
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfig.class);

		// usage of objects without creating them, just taking them from IoC container (ApplicationContext)
		DummyPrinterManager dummyPrinterManager = applicationContext.getBean(DummyPrinterManager.class);
		dummyPrinterManager.getPrinter().printDummyMessage();
		System.out.println("DummyPrinter instance: " + dummyPrinterManager.getPrinter());

		RegularPrinterManger regularPrinterManger = applicationContext.getBean(RegularPrinterManger.class);
		regularPrinterManger.getPrinter().printDummyMessage();
		System.out.println("DummyPrinter instance: " + regularPrinterManger.getPrinter());
	}
}
