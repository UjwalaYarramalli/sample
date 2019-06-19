package com.ssd.learning;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SampleApplication.class).web(WebApplicationType.NONE).run(args);
	}

}
