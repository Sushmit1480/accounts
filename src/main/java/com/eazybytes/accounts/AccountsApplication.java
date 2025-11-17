package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts micorservice REST API Documnetation",
				description = "Bank Accounts microservice REST API Documnetation",
				version = "v1",
				contact = @Contact(
						name = "Sushmit Patil",
						email = "sushmit@gmail.com",
						url = "https://www.eazybytes.com"
						),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.eazybytes.com"
						)
				),
		externalDocs = @ExternalDocumentation(
				description = "Bank Accounts microservice REST API Documnetation",
				url = "https://www.example.com/swagger-ui.html"
				)
		)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
