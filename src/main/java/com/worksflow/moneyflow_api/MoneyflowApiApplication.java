package com.worksflow.moneyflow_api;

import com.worksflow.moneyflow_api.config.property.MoneyflowApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MoneyflowApiProperty.class)
public class MoneyflowApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyflowApiApplication.class, args);
	}
}
