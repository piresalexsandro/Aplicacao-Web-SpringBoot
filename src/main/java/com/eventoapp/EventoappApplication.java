package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@EnableConfigurationProperties
//@ComponentScan(basePackages={"com.eventoapp"})
@EnableAutoConfiguration
@Configuration
@ComponentScan(value= "com.eventoapp")
@SpringBootApplication(scanBasePackages = {"com.eventoapp"})
public class EventoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
	}

}
