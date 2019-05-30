package com.scoop.validated.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import javax.validation.Validation;
import javax.validation.Validator;


@Configuration
@EnableAutoConfiguration
public class HibernateValidatorConfiguration {
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
		MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
		processor.setValidator(validator());
		return processor;
	}

	@Bean
	public Validator validator() {
		return Validation
				.byProvider(HibernateValidator.class)
				.configure()
				.addProperty("hibernate.validator.fail_fast", "true")
				.buildValidatorFactory()
				.getValidator();
	}
}
