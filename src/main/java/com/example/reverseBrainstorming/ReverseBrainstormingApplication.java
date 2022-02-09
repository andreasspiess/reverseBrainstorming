package com.example.reverseBrainstorming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ReverseBrainstormingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseBrainstormingApplication.class, args);
	}

}
