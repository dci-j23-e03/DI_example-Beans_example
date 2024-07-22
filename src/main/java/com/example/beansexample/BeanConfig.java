package com.example.beansexample;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.beansexample")
public class BeanConfig {

  @Primary
  @Bean(name = "configuredPrinter")
  @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
  public DummyPrinter configuredPrinter() {
    DummyPrinter configuredPrinter = new DummyPrinter();
    configuredPrinter.setMessage("Hello everybody from configured bean!");
    return configuredPrinter;
  }

  @Bean(name = "configuredPrinter2")
  @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
  public DummyPrinter configuredPrinter2() {
    DummyPrinter configuredPrinter = new DummyPrinter();
    configuredPrinter.setMessage("Hello everybody from configured bean number 2!");
    return configuredPrinter;
  }

}
