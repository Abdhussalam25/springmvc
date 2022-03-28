package com.training.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudTutorProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTutorProviderServiceApplication.class, args);
	}

}
