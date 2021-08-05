package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String exampleString = "This is just a sample string";
                int stringLength = exampleString.length();
		if (stringLength == 0)
		{
			System.out.println("String not exists");
		}
		else
		{
			System.out.println(exampleString);
		}
	}

}
