package com.abhi.com.abhi;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeTrainingAppApplication {
	public static Logger log= Logger.getLogger(EmployeeTrainingAppApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeTrainingAppApplication.class, args);
		
		log.setLevel(Level.WARN);
		log.info("starting Spring boot app");
		log.warn("warning" );
		log.info("starting Spring boot app");
	}
}
